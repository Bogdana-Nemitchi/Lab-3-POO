package Arta;
public class Muzician extends Artist implements SpectacolDeArta {
    private String instrument;

    public Muzician(String nume, String instrument) {
        super(nume);
        this.instrument = instrument;
    }

    @Override
    public void creeazaArta() {
        System.out.println(nume + " creează muzică folosind " + instrument);
    }

    @Override
    public void performeaza() {
        System.out.println(nume + " interpretează o piesă muzicală.");
    }

    void performeaza(int durata) {
        System.out.println(nume + " interpretează pentru " + durata + " minute.");
    }
}
