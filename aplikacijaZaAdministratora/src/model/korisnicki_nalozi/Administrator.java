package model.korisnicki_nalozi;

import jdk.jshell.spi.ExecutionControl;
import model.korisnicki_nalozi.KorisnikSistema;
import model.pracenje_popisa.Izvjestaj;
import model.pracenje_popisa.JEZIK;
import model.pracenje_popisa.PISMO;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public abstract class Administrator extends KorisnikSistema
{
    public Administrator(String JMBG,
                         String ime,
                         String prezime,
                         String korisnickoIme,
                         String lozinka,
                         JEZIK jezik,
                         PISMO pismo)
    {
        super(JMBG, ime, prezime, korisnickoIme, lozinka, jezik, pismo);
    }

    public Izvjestaj kreirajIzvjestaj(Class<? extends Izvjestaj> izvjestaj, Object... params) throws Exception {
        Constructor constructors[] = izvjestaj.getDeclaredConstructors();
        Object obj = null;
        for (Constructor cons : constructors) {
            Class[] paramsOfConstructor = cons.getParameterTypes();
            if (paramsOfConstructor.length == 1 && paramsOfConstructor[0] == String.class) {
                obj = cons.newInstance(params);
                break;
            }
            else if(paramsOfConstructor.length == 0){
                obj = cons.newInstance(new Object(){});
                }
            else
                throw new ExecutionControl.NotImplementedException("TODO");
        }
        return (Izvjestaj) obj;
    }
}