public class MainEntities {
    public static void main(String[] args) {

        Entity jugador = new Entity();
        Entity enemigo = new Entity();

        jugador.addComponent(new MovementComponent(0, 0));
        jugador.addComponent(new HealthComponent(20));
        jugador.addComponent(new AttackComponent(enemigo));

        enemigo.addComponent(new HealthComponent(15));

        for (int tick = 1; tick <= 5; tick++) {
            System.out.println("\n---- TICK " + tick + " ----");
            System.out.println("Jugador:");
            jugador.update();

            System.out.println("Enemigo:");
            enemigo.update();
        }
    }
}
