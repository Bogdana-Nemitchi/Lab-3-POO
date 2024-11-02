package Arta;
public class Pictor extends Artist {

    Pictor(String nume) {
        super(nume);
    }

    @Override
    public void creeazaArta() {
        System.out.println(nume + " creează o pictură frumoasă.");
    }
}