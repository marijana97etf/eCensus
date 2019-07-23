package model.pracenje_popisa;

class KorisnikSistema
{
    protected JEZIK jezik;
    protected PISMO pismo;

    public KorisnikSistema() {
        super();
    }

    public JEZIK getJezik() {
        return jezik;
    }

    public void setJezik(JEZIK jezik) {
        this.jezik = jezik;
    }

    public PISMO getPismo() {
        return pismo;
    }

    public void setPismo(PISMO pismo) {
        this.pismo = pismo;
    }
}