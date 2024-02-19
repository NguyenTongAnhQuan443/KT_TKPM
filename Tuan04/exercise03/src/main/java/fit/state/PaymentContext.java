
package fit.state;

// Context class for managing payment states
public class PaymentContext {
    private PaymentState state;

    public PaymentContext() {
        this.state = new InitializedState();
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void processPayment() {
        state.handlePayment(this);
    }
}
