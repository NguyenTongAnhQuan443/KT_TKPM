
package fit.state;

// Concrete State: Initialized
public class InitializedState implements PaymentState {
    @Override
    public void handlePayment(PaymentContext context) {
        System.out.println("Payment initialized.");
        context.setState(new ProcessingState());
    }
}
