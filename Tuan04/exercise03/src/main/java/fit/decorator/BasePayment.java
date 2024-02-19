package fit.decorator;

// Concrete Component
public class BasePayment implements PaymentFeature {
    @Override
    public double applyFeature(double amount) {
        return amount;
    }
}
