package fit.state;


public class NewOrderState implements OrderState {
    public void handleOrder(OrderContext context) {
        System.out.println("Checking order information...");
        context.setState(new ProcessingState());
    }
}
