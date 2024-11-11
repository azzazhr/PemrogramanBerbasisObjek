public class Barrier implements Destroyable{
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= strength * 0.1; // Pengurangan 10% setiap kali destroyed() dipanggil
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }
}
