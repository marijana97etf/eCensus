package test;

import model.pracenje_popisa.Administrator;
import model.pracenje_popisa.Izvjestaj;
import model.pracenje_popisa.statisticki_izvjestaji.za_starost_i_pol.StatistickiIzvjestajPremaStarostiIPoluPoPetogodistimaNaselja;

public class TestIzvjestaji {
    public static void main(String... args) throws Exception
    {
        var admin = new Administrator();

        Izvjestaj izvjestaj = new StatistickiIzvjestajPremaStarostiIPoluPoPetogodistimaNaselja("Banja Luka");
        izvjestaj.kreirajIzvjestaj();
        System.out.println(((StatistickiIzvjestajPremaStarostiIPoluPoPetogodistimaNaselja)izvjestaj).getOpstina());

        var izvjestaj2 = admin.kreirajIzvjestaj(StatistickiIzvjestajPremaStarostiIPoluPoPetogodistimaNaselja.class, "Prijedor");
        System.out.println(((StatistickiIzvjestajPremaStarostiIPoluPoPetogodistimaNaselja)izvjestaj2).getOpstina());
    }
}
