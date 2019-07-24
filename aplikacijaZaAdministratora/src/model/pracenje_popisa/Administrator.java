package model.pracenje_popisa;

import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Administrator extends KorisnikSistema
{
    public Administrator() {
        super();
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