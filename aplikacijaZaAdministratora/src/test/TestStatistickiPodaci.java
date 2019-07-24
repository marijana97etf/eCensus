package test;

import model.pracenje_popisa.statisticki_podaci.AgregatniPodaci;
import java.util.Map;

public class TestStatistickiPodaci {
    public static void main(String... args)
    {
        Map podaci = new AgregatniPodaci();
        podaci.put("Broj ljudi", 5);
        podaci.put("Broj stanova", 10);
        podaci.put("Prosjek broja godina", 44.5);

        System.out.println(podaci);
    }
}
