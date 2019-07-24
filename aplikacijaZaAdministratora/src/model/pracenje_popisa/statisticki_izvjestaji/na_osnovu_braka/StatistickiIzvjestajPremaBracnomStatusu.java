package model.pracenje_popisa.statisticki_izvjestaji.na_osnovu_braka;

import model.pracenje_popisa.statisticki_izvjestaji.StatistickiIzvjestaj;
import model.pracenje_popisa.statisticki_podaci.StatistickiPodaci;

/**
 * Statistički izvještaj prema bračnom statusu i fertilitetu ženskog stanovništva.
 */
public abstract class StatistickiIzvjestajPremaBracnomStatusu extends StatistickiIzvjestaj {
    public StatistickiIzvjestajPremaBracnomStatusu(StatistickiPodaci[] statistickiPodaci) {
        super(statistickiPodaci);
    }
}
