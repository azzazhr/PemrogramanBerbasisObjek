public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += health * 0.3;
                break;
            case 2:
                health += health * 0.4;
                break;
            case 3:
                health += health * 0.5;
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.2; // Pengurangan 20% setiap kali destroyed() dipanggil
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data = " + super.getZombieInfo();
    }
}
