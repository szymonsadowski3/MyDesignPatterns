package abstract_factory;

public class WindowsLabel implements Label {
    @Override
    public void display() {
        System.out.println("Windows label!");
    }
}
