package model.pracenje_popisa.statisticki_izvjestaji.za_starost_i_pol;

import model.pracenje_popisa.Izvjestaj;

/**
 * Statistički izvještaj prema starosti i polu po petogodistima naselja.
 */
public class StatistickiIzvjestajPremaStarostiIPoluPoPetogodistimaNaselja implements StatistickiIzvjestajZaStarostIPol{
    protected String opstina;

    public StatistickiIzvjestajPremaStarostiIPoluPoPetogodistimaNaselja(String opstina) {
        this.opstina = opstina;
    }

    public String getOpstina() {
        return opstina;
    }

    public void setOpstina(String opstina) {
        this.opstina = opstina;
    }

    @Override
    public Izvjestaj kreirajIzvjestaj() {
        //TODO
        return null;
    }
}
