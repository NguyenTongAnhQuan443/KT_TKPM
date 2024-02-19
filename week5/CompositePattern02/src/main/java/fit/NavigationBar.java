
package fit;

public class NavigationBar implements UIComponent {
    @Override
    public void render() {
        System.out.println("Rendering NavigationBar");
    }

    @Override
    public void add(UIComponent component) {
        throw new UnsupportedOperationException("Cannot add to a Button");
    }

    @Override
    public void remove(UIComponent component) {
        throw new UnsupportedOperationException("Cannot remove from a Button");
    }

    @Override
    public UIComponent getChild(int index) {
        throw new UnsupportedOperationException("Button has no children");
    }
}
