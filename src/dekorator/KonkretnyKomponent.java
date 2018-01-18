package dekorator;

public class KonkretnyKomponent implements Komponent {
    @Override
    public String methodA() {
        return "MethodA in KonkretnyKomponent";
    }

    @Override
    public String methodB() {
        return "MethodB in KonkretnyKomponent";
    }
}
