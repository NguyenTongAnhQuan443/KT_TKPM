package fit.state;


public class DeliveredState implements OrderState {
    public void handleOrder(OrderContext context) {
        System.out.println("Order delivered successfully.");
    }
}
