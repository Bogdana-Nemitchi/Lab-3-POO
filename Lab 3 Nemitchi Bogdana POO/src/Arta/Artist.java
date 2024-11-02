package Arta;
public abstract class Artist {
    protected String nume;

    public Artist(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    public abstract void creeazaArta();
}