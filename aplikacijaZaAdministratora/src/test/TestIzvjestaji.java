package test;

import model.pracenje_popisa.Izvjestaj;
import model.pracenje_popisa.statisticki_izvjestaji.za_starost_i_pol.StatistickiIzvjestajPremaStarostiIPoluPoPetogodistimaNaselja;

public class TestIzvjestaji {
    public static void main(String... args)
    {
        Izvjestaj izvjestaj = new StatistickiIzvjestajPremaStarostiIPoluPoPetogodistimaNaselja("Banja Luka");
        izvjestaj.kreirajIzvjestaj();
        System.out.println(((StatistickiIzvjestajPremaStarostiIPoluPoPetogodistimaNaselja)izvjestaj).getOpstina());
    }
}
