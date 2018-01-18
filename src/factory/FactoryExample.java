package factory;

public class FactoryExample {
    public static void main(String[] args) {
        ProductFactory pf = new ProductAFactory();
        pf.createProduct().show();
    }
}
