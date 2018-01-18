package strategia;

public class StrategiaDemo {

    public static void main(String[] args) {
        StrategiaDemo strategiaDemo = new StrategiaDemo();
        strategiaDemo.clientMethod(new Impl1());
    }

    private void clientMethod(Strategy strategy) {
        strategy.solve();
    }
}

interface Strategy {
    void solve();
}

abstract class TemplateMethod1 implements Strategy {
    public void solve() {
        start();
        while (!isSolved())
            nextTry();

        stop();
    }

    protected abstract void start();

    protected abstract boolean isSolved();

    protected abstract void nextTry();

    protected abstract void stop();
}

class Impl1 extends TemplateMethod1{
    private boolean solved = false;
    private int iteration = 0;


    @Override
    protected void start() {
        System.out.println("Starting...");
    }

    @Override
    protected boolean isSolved() {
        return solved;
    }

    @Override
    protected void nextTry() {
        System.out.println("try nr: " + iteration);
        if(++iteration == 3) {
            solved = true;
        }
    }

    @Override
    protected void stop() {
        System.out.println("Stopping");
    }
}
