
package fit.decorator;

//Decorator: Discount Code

public class DiscountCodeDecorator implements PaymentFeature {
    private PaymentFeature feature;

    public DiscountCodeDecorator(PaymentFeature feature) {
        this.feature = feature;
    }

    @Override
    public double applyFeature(double amount) {
        return feature.applyFeature(amount) - 10.0; // Subtract $10 discount
    }
}
