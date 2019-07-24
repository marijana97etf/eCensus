package model.pracenje_popisa.statisticki_izvjestaji.prema_domacinstvima;

import model.pracenje_popisa.Izvjestaj;
import model.pracenje_popisa.statisticki_podaci.StatistickiPodaci;

/**
 * Statistički izvještaj prema domaćinstvima koja obavljaju poljoprivrednu aktivnost.
 */
public class StatistickiIzvjestajPremaPoljoprivredi extends StatistickiIzvjestajPremaDomacinstvima {
    public StatistickiIzvjestajPremaPoljoprivredi(StatistickiPodaci[] statistickiPodaci) {
        super(statistickiPodaci);
    }

    @Override
    public Izvjestaj kreirajIzvjestaj() {
        //TODO: kreiranje izvjestaja
        return null;
    }
}
