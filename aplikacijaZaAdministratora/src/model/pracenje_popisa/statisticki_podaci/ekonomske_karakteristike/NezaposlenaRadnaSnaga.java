package model.pracenje_popisa.statisticki_podaci.ekonomske_karakteristike;

import org.jetbrains.annotations.Contract;

public class NezaposlenaRadnaSnaga implements RadnoAktivnoStanovnistvo {
    private STANJE_NEZAPOSLENOG stanjeNezaposlenog;


    // CONSTRUKTOR

    @Contract(pure = true)
    public NezaposlenaRadnaSnaga(STANJE_NEZAPOSLENOG stanjeNezaposlenog) {
        this.stanjeNezaposlenog = stanjeNezaposlenog;
    }


    // SETTERS AND GETTERS

    public STANJE_NEZAPOSLENOG getStanjeNezaposlenog() {
        return stanjeNezaposlenog;
    }

    public void setStanjeNezaposlenog(STANJE_NEZAPOSLENOG stanjeNezaposlenog) {
        this.stanjeNezaposlenog = stanjeNezaposlenog;
    }
}
