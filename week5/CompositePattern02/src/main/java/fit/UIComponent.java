
package fit;
public interface UIComponent {
    void render();
    void add(UIComponent component);
    void remove(UIComponent component);
    UIComponent getChild(int index);
}
