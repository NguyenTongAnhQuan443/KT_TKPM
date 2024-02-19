package fit.strategy;

public class ExpressShipping implements ShippingStrategy {
    public void ship() {
        System.out.println("Shipping with express delivery.");
    }
}
