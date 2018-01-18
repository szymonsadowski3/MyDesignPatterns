package dekorator;

public abstract class Dekorator implements Komponent {
    protected Komponent komponent;

    public String methodA() {
        return komponent.methodA();
    }

    public String methodB() {
        return komponent.methodA();
    }
}
