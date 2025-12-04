public class AttackComponent implements Component {
    private Entity parent;
    private Entity target;

    public AttackComponent(Entity target) {
        this.target = target;
    }

    @Override
    public void update() {
        HealthComponent hp = target.getComponent(HealthComponent.class);
        if (hp != null) {
            hp.takeDamage(2);
            System.out.println("Ataque -> Daño infligido al objetivo.");
        }
    }

    @Override
    public void setParent(Entity parent) {
        this.parent = parent;
    }
}
