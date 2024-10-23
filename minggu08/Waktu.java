package minggu08;

public class Waktu {
    private int hari;

    public Waktu() {
        this.hari = 1;
    }

    public int getHari() {
        return hari;
    }

    public void lewatiHari() {
        hari++;
        System.out.println("Hari ke-" + hari);
    }
}