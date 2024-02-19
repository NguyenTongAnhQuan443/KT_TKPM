package fit.decorator;

public class BasicOrder implements OrderComponent {
    public void process() {
        System.out.println("Processing basic order.");
    }
}
