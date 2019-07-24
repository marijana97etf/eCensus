package model.pracenje_popisa.statisticki_izvjestaji.prema_obiljezjima_nacije;

import model.pracenje_popisa.Izvjestaj;
import model.pracenje_popisa.statisticki_podaci.StatistickiPodaci;

/**
 * Statistički izvještaj prema maternjem jeziku i polu.
 */
public class StatistickiIzvjestajPremaJeziku extends StatistickiIzvjestajPremaObiljezjimaNacije {
    public StatistickiIzvjestajPremaJeziku(StatistickiPodaci[] statistickiPodaci) {
        super(statistickiPodaci);
    }

    @Override
    public Izvjestaj kreirajIzvjestaj() {
        //TODO
        return null;
    }
}
