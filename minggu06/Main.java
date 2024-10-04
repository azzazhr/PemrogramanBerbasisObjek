package minggu06;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(4, 5);
        System.out.println("Luas Persegi Panjang: " + pp.luas());
        System.out.println("Keliling Persegi Panjang: " + pp.keliling());

        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        Segitiga segitiga = new Segitiga(3, 4);
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
    }
}
