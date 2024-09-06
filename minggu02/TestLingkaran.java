package minggu02;

public class TestLingkaran {
    public static void main(String[] args) {
        double jariJari = 7;

        Lingkaran lingkaran = new Lingkaran(jariJari);

        double luas = lingkaran.hitungLuas();
        double keliling = lingkaran.hitungKeliling();

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }
}
