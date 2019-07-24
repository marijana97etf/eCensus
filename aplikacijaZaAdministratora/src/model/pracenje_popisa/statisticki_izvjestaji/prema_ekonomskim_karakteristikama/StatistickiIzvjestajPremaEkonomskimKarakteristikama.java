package model.pracenje_popisa.statisticki_izvjestaji.prema_ekonomskim_karakteristikama;

import model.pracenje_popisa.statisticki_izvjestaji.StatistickiIzvjestaj;
import model.pracenje_popisa.statisticki_podaci.StatistickiPodaci;

/**
 * Statistički izvještaj prema ekonomskim karakteristikama
 */
public abstract class StatistickiIzvjestajPremaEkonomskimKarakteristikama extends StatistickiIzvjestaj {
    public StatistickiIzvjestajPremaEkonomskimKarakteristikama(StatistickiPodaci[] statistickiPodaci) {
        super(statistickiPodaci);
    }
}
