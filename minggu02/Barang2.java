package minggu02;

public class Barang2 {
    private String kode;
    private String namaBarang;
    private int hargaDasar;
    private float diskon;

    public Barang2(String kode, String namaBarang, int hargaDasar, float diskon) {
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual() {
        int hargaJual = hargaDasar - (int) (diskon / 100 * hargaDasar);
        return hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode Barang: " + kode);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Dasar: Rp " + hargaDasar);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Harga Jual: Rp " + hitungHargaJual());
    }
}
