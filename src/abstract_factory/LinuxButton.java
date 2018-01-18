package abstract_factory;

public class LinuxButton implements Button {
    @Override
    public void display() {
        System.out.println("Linux Button!");
    }
}
