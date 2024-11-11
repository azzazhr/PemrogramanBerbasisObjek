public class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        if (level == 1) {
            health += health * 0.2;
        } else if (level == 2) {
            health += health * 0.3;
        } else if (level == 3) {
            health += health * 0.4;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.1;
    }

    public String getZombieInfo() {
        return "Health: " + health + ", Level: " + level;
    }
}
