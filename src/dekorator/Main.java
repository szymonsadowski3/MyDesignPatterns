package dekorator;

public class Main {

    public static void main(String[] args) {
        Komponent komp = new KonkretnyDekorator(new KonkretnyKomponent());
        String wynikA = komp.methodA();
        String wynikB = komp.methodB();

        System.out.println(wynikA);
        System.out.println(wynikB);
    }
}
