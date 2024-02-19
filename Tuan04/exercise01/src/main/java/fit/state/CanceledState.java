package fit.state;

public class CanceledState implements OrderState {
    public void handleOrder(OrderContext context) {
        System.out.println("Order canceled, processing refund...");
    }
}
