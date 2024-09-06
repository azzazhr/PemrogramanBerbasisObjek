package minggu02;

public class Lingkaran {
    private double phi = 3.14;
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }
}
