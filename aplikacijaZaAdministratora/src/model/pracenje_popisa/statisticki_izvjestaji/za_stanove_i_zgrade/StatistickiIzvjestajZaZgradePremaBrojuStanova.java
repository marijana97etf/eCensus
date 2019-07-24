package model.pracenje_popisa.statisticki_izvjestaji.za_stanove_i_zgrade;

import model.pracenje_popisa.Izvjestaj;
import model.pracenje_popisa.statisticki_podaci.StatistickiPodaci;

/**
 * Statistički izvještaj za zgrade prema brojuStanova.
 */
public class StatistickiIzvjestajZaZgradePremaBrojuStanova extends StatistickiIzvjestajZaStanoveIZgrade {
    public StatistickiIzvjestajZaZgradePremaBrojuStanova(StatistickiPodaci[] statistickiPodaci) {
        super(statistickiPodaci);
    }

    @Override
    public Izvjestaj kreirajIzvjestaj() {
        //TODO
        return null;
    }
}
