import factory_method.Product;
import factory_method.ProductFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Product product_1 = ProductFactory.getProduct("A");

        System.out.println(product_1.getName());
    }
}
