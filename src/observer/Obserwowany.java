package observer;

import java.util.ArrayList;

public class Obserwowany {
    private int stan = 0;
    private ArrayList<Obserwator> obserwatorzy = new ArrayList<>();

    public void dodajObserwatora(Obserwator obserwator) {
        obserwatorzy.add(obserwator);
    }

    public void usunObserwatora(Obserwator obserwator) {
        obserwatorzy.remove(obserwator);
    }

    public int pobierzStan() {
        return stan;
    }

    public void zmienStan(int nowy) {
        this.stan = nowy;
        this.powiadomObserwatorow();
    }

    public void powiadomObserwatorow() {
        for (Obserwator obserwator: obserwatorzy) {
            obserwator.aktualizacja(stan);
        }
    }
}
