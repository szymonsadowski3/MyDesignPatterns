package abstract_factory;

public class LinuxFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Label createLabel() {
        return new LinuxLabel();
    }
}
