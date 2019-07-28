package model.korisnicki_nalozi;

import model.pracenje_popisa.JEZIK;
import model.pracenje_popisa.PISMO;

import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public abstract class KorisnikSistema implements Serializable
{
    protected String JMBG;
    protected String ime;
    protected String prezime;
    protected String korisnickoIme;
    protected String lozinkaHash;

    protected JEZIK jezik;
    protected PISMO pismo;

    public KorisnikSistema(
             String JMBG,
             String ime,
             String prezime,
             String korisnickoIme,
             String lozinka,
             JEZIK jezik,
             PISMO pismo)
    {
        this.JMBG = JMBG;
        this.ime = ime;
        this.prezime = prezime;
        this.korisnickoIme = korisnickoIme;
        this.lozinkaHash = napraviHesLozinke(lozinka);
        this.jezik = jezik;
        this.pismo = pismo;
    }

    public static String napraviHesLozinke(String lozinka)
    {
        try {
            return new String(MessageDigest.getInstance("MD5").digest(lozinka.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        finally {
            return lozinka;
        }
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinkaHash() {
        return lozinkaHash;
    }

    public JEZIK getJezik() {
        return jezik;
    }

    public void setJezik(JEZIK jezik) {
        this.jezik = jezik;
    }

    public PISMO getPismo() {
        return pismo;
    }

    public void setPismo(PISMO pismo) {
        this.pismo = pismo;
    }
}