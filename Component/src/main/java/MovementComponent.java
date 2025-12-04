public class MovementComponent implements Component {
    private Entity parent;
    private int x, y;

    public MovementComponent(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void update() {
        x++;
        y++;
        System.out.println("Movimiento -> Nueva posición: (" + x + ", " + y + ")");
    }

    @Override
    public void setParent(Entity parent) {
        this.parent = parent;
    }
}
