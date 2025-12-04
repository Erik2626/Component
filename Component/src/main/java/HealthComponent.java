public class HealthComponent implements Component {
    private Entity parent;
    private int maxHealth;
    private int health;

    public HealthComponent(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int dmg) {
        health -= dmg;
        if (health < 0) health = 0;
    }

    @Override
    public void update() {
        if (health < maxHealth) health++;
        System.out.println("Salud -> " + health + "/" + maxHealth);
    }

    @Override
    public void setParent(Entity parent) {
        this.parent = parent;
    }
}
