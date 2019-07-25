package test;

import model.pracenje_popisa.Administrator;
import model.pracenje_popisa.Izvjestaj;
import model.pracenje_popisa.statisticki_izvjestaji.za_starost_i_pol.SI_PremaStarostiIPoluPoPetogodistimaNaselja;

public class TestIzvjestaji {
    public static void main(String... args) throws Exception
    {
        var admin = new Administrator();

        Izvjestaj izvjestaj = new SI_PremaStarostiIPoluPoPetogodistimaNaselja("Banja Luka");
        izvjestaj.kreirajIzvjestaj();
        System.out.println(((SI_PremaStarostiIPoluPoPetogodistimaNaselja)izvjestaj).getOpstina());

        var izvjestaj2 = admin.kreirajIzvjestaj(SI_PremaStarostiIPoluPoPetogodistimaNaselja.class, "Prijedor");
        System.out.println(((SI_PremaStarostiIPoluPoPetogodistimaNaselja)izvjestaj2).getOpstina());
    }
}
