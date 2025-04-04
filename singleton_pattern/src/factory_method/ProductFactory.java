package factory_method;

public class ProductFactory {
    public static Product getProduct(String type) {
        switch (type) {
            case "A":
                return new ProductA();
            case "B":
                return new ProductB();
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}