
package fit.decorator;

// Decorator: Processing Fee
public class ProcessingFeeDecorator implements PaymentFeature {
    private PaymentFeature feature;

    public ProcessingFeeDecorator(PaymentFeature feature) {
        this.feature = feature;
    }

    @Override
    public double applyFeature(double amount) {
        return feature.applyFeature(amount) + 5.0; // Add $5 processing fee
    }
}
