package fit.state;
public class ProcessingState implements OrderState {
    public void handleOrder(OrderContext context) {
        System.out.println("Packing and shipping the order...");
        context.setState(new DeliveredState());
    }
}
