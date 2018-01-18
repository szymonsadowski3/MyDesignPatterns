package abstract_factory;

public class WindowsFactory implements AbstractFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Label createLabel() {
        return new WindowsLabel();
    }
}
