
package fit.state;

// --- State Pattern ---
// State interface representing different payment states
public interface PaymentState {
    void handlePayment(PaymentContext context);
}
