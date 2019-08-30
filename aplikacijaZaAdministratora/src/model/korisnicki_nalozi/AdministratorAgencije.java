package model.korisnicki_nalozi;

import model.pracenje_popisa.JEZIK;
import model.pracenje_popisa.PISMO;

public class AdministratorAgencije extends Administrator {
    public AdministratorAgencije(String JMBG,
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
