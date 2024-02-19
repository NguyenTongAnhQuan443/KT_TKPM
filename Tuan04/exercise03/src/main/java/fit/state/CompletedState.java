
package fit.state;
// Concrete State: Completed
public class CompletedState implements PaymentState {
    @Override
    public void handlePayment(PaymentContext context) {
        System.out.println("Payment completed successfully.");
    }
}
