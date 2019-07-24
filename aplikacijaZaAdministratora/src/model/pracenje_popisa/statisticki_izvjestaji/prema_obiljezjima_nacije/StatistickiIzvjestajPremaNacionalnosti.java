package model.pracenje_popisa.statisticki_izvjestaji.prema_obiljezjima_nacije;

import model.pracenje_popisa.Izvjestaj;
import model.pracenje_popisa.statisticki_podaci.StatistickiPodaci;

/**
 * Statistički izvještaj prema nacionalnoj pripadnosti i polu.
 */
public class StatistickiIzvjestajPremaNacionalnosti extends StatistickiIzvjestajPremaObiljezjimaNacije {
    public StatistickiIzvjestajPremaNacionalnosti(StatistickiPodaci[] statistickiPodaci) {
        super(statistickiPodaci);
    }

    @Override
    public Izvjestaj kreirajIzvjestaj() {
        //TODO
        return null;
    }
}
