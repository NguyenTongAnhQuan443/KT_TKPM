
package fit.decorator;


public class OrderWithTracking implements OrderComponent {
    private OrderComponent decoratedOrder;

    public OrderWithTracking(OrderComponent order) {
        this.decoratedOrder = order;
    }

    public void process() {
        decoratedOrder.process();
        System.out.println("Tracking order status...");
    }
}
