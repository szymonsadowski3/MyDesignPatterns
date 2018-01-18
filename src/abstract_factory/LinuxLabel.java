package abstract_factory;

public class LinuxLabel implements Label {
    @Override
    public void display() {
        System.out.println("Linux Label!");
    }
}
