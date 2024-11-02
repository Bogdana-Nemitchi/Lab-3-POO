package Arta;
public class DemonstrareArta {
    public static void main(String[] args) {
        Artist muzician = new Muzician("Ion", "chitară");
        Artist pictor = new Pictor("Maria");

        muzician.creeazaArta();
        pictor.creeazaArta();

        SpectacolDeArta spectacol = (SpectacolDeArta) muzician;
        spectacol.performeaza();

        Muzician chitarist = new Muzician("Mihai", "chitară electrică");
        chitarist.performeaza();
        chitarist.performeaza(30);

    }
}
