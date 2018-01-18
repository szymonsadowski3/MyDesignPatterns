package abstract_factory;

public class Main {
    public static void main(String[] args) {
        String config = "winwe";

        AbstractFactory factory;

        if(config.equals("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new LinuxFactory();
        }

        Button button = factory.createButton();
        Label label = factory.createLabel();

        button.display();
        label.display();
    }
}
