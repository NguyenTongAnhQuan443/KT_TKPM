
package fit.state;
// Concrete State: Processing
public class ProcessingState implements PaymentState {
    @Override
    public void handlePayment(PaymentContext context) {
        System.out.println("Payment is being processed.");
        context.setState(new CompletedState());
    }
}
