package model.pracenje_popisa.statisticki_izvjestaji.za_stanove_i_zgrade;

import model.pracenje_popisa.statisticki_izvjestaji.StatistickiIzvjestaj;
import model.pracenje_popisa.statisticki_podaci.StatistickiPodaci;

/**
 * Statistički izvještaj za stanove i zgrade.
 */
public abstract class StatistickiIzvjestajZaStanoveIZgrade extends StatistickiIzvjestaj
{
    public StatistickiIzvjestajZaStanoveIZgrade(StatistickiPodaci[] statistickiPodaci) {
        super(statistickiPodaci);
    }
}
