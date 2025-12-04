import java.util.ArrayList;

public class Entity {

    private ArrayList<Component> components = new ArrayList<>();

    public void addComponent(Component c) {
        c.setParent(this);
        components.add(c);
    }

    public <T extends Component> T getComponent(Class<T> type) {
        for (Component c : components) {
            if (type.isInstance(c)) return type.cast(c);
        }
        return null;
    }

    public void update() {
        for (Component c : components) {
            c.update();
        }
    }
}
