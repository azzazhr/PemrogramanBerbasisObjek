package minggu03.MotorEncapsulation;

public class Motor {
    public int kecepatan = 0;
    public boolean kotakOn = false;

    public void printStatus() {
        if (kotakOn == true) {
            System.out.println("Kotak On");
        } else {
            System.out.println("Kotak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
