package minggu03.MotorEncapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kotakOn = false;
    private int kecepatanMaksimum = 100;

    public void nyalakanMesin() {
        kotakOn = true;
    }

    public void matikanMesin() {
        kotakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kotakOn) {
            if (kecepatan + 5 > kecepatanMaksimum) {
                kecepatan = kecepatanMaksimum;
                System.out.println("Kecepatan sudah mencapai batas maksimum: " + kecepatanMaksimum + "\n");
            } else {
                kecepatan += 5;
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kotakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kotakOn == true) {
            System.out.println("Kotak On");
        } else {
            System.out.println("Kotak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
