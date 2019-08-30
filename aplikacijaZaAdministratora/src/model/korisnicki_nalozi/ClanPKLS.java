package model.korisnicki_nalozi;

import model.pracenje_popisa.JEZIK;
import model.pracenje_popisa.PISMO;

public class ClanPKLS extends Administrator {
    public ClanPKLS(String JMBG,
                    String ime,
                    String prezime,
                    String korisnickoIme,
                    String lozinka,
                    JEZIK jezik,
                    PISMO pismo)
    {
        super(JMBG, ime, prezime, korisnickoIme, lozinka, jezik, pismo);
    }
}
