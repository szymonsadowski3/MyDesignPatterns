package stan;

public class StanDemo {
    public static void main(String[] args) {
        Odtwarzacz odtwarzacz = new Odtwarzacz();
        odtwarzacz.nacisnijStart();
        odtwarzacz.nacisnijStart();
        odtwarzacz.nacisnijStart();
        odtwarzacz.nacisnijStop();
        odtwarzacz.nacisnijStop();
        odtwarzacz.nacisnijStop();
    }
}

class Odtwarzacz {
    Stan stan = new StanOdtwarzaczWylaczony(this);

    public void zmienStan(Stan nowyStan) {
        this.stan = nowyStan;
    }

    public void nacisnijStart() {
        this.stan.nacisnijStart();
    }

    public void nacisnijStop() {
        this.stan.nacisnijStop();
    }

    public void odtworzPiosenke() {
        System.out.println("Gram piosenke!");
    }
}

class StanOdtwarzaczWylaczony implements Stan {
    Odtwarzacz odtwarzacz;

    StanOdtwarzaczWylaczony (Odtwarzacz odtwarzacz) {
        this.odtwarzacz = odtwarzacz;
    }

    @Override
    public void nacisnijStart() {
        odtwarzacz.odtworzPiosenke();
        odtwarzacz.zmienStan(new StanOdtwarzaczWlaczony(odtwarzacz));
    }

    @Override
    public void nacisnijStop() {
        // nic
    }
}

class StanOdtwarzaczWlaczony implements Stan {
    Odtwarzacz odtwarzacz;

    StanOdtwarzaczWlaczony(Odtwarzacz odtwarzacz) {
        this.odtwarzacz = odtwarzacz;
    }

    @Override
    public void nacisnijStart() {
        // nic
    }

    @Override
    public void nacisnijStop() {
        System.out.println("zatrzymuje piosenke!");
        odtwarzacz.zmienStan(new StanOdtwarzaczWylaczony(odtwarzacz));
    }
}
