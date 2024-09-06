package minggu02;

public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public double hargaPerHari;
    public int lamaSewa;

    public double hitungHarga() {
        return hargaPerHari * lamaSewa;
    }

    public void tampilkanDataPeminjaman() {
        System.out.println("========================================");
        System.out.println("            Rincian Peminjaman          ");
        System.out.println("========================================");
        System.out.println("ID Peminjaman    : " + id);
        System.out.println("Nama Member      : " + namaMember);
        System.out.println("Nama Game        : " + namaGame);
        System.out.println("Harga per Hari   : " + hargaPerHari);
        System.out.println("Lama Sewa        : " + lamaSewa + " hari");
        System.out.println("Harga Total      : " + hitungHarga());
        System.out.println("========================================");
    }

}
