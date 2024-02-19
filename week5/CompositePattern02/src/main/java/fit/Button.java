
package fit;

public class Button implements UIComponent {
    @Override
    public void render() {
        System.out.println("Rendering Button");
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