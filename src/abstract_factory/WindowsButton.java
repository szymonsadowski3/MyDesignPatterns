package abstract_factory;

public class WindowsButton implements Button {
    @Override
    public void display() {
        System.out.println("Windows button!");
    }
}
