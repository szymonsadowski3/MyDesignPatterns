package observer;

public class Main {
    public static void main(String[] args) {
        Obserwator obserwator = new Obserwator();
        Obserwowany obserwowany = new Obserwowany();
        obserwowany.dodajObserwatora(obserwator);
        obserwowany.zmienStan(10);
    }
}
