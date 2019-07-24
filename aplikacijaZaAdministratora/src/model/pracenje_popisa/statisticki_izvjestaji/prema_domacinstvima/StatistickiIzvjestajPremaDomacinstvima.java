package model.pracenje_popisa.statisticki_izvjestaji.prema_domacinstvima;

import model.pracenje_popisa.statisticki_izvjestaji.StatistickiIzvjestaj;
import model.pracenje_popisa.statisticki_podaci.StatistickiPodaci;

/**
 * Statistički izvještaj prema domaćinstvima.
 */
public abstract class StatistickiIzvjestajPremaDomacinstvima extends StatistickiIzvjestaj {
    public StatistickiIzvjestajPremaDomacinstvima(StatistickiPodaci[] statistickiPodaci) {
        super(statistickiPodaci);
    }
}
