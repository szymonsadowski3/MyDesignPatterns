package dekorator;

public class KonkretnyDekorator extends Dekorator {
    Komponent konkretnyKomponent;

    public KonkretnyDekorator(Komponent konkretnyKomponent) {
        this.konkretnyKomponent = konkretnyKomponent;
    }

    public void logA() {
        System.out.println("Method A + log in KonretnyDekorator");
    }

    public void logB() {
        System.out.println("Method B + log in KonretnyDekorator");
    }

    @Override
    public String methodA() {
        this.logA();
        return konkretnyKomponent.methodA();
    }

    @Override
    public String methodB() {
        this.logB();
        return konkretnyKomponent.methodB();
    }
}
