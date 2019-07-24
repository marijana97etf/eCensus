package model.pracenje_popisa.statisticki_izvjestaji.prema_obrazovnim_karakteristikama;

import model.pracenje_popisa.statisticki_izvjestaji.StatistickiIzvjestaj;
import model.pracenje_popisa.statisticki_podaci.StatistickiPodaci;

/**
 * Statistički izvještaj prema obrazovnim karakteristikama
 */
public abstract class StatistickiIzvjestajPremaObrazovanju extends StatistickiIzvjestaj {
    public StatistickiIzvjestajPremaObrazovanju(StatistickiPodaci[] statistickiPodaci) {
        super(statistickiPodaci);
    }
}
