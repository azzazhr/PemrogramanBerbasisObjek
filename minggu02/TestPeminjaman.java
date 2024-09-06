package minggu02;

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman peminjaman1 = new Peminjaman();
        peminjaman1.id = 105;
        peminjaman1.namaMember = "Azzahra Attaqina";
        peminjaman1.namaGame = "Mario Bross";
        peminjaman1.hargaPerHari = 50000;
        peminjaman1.lamaSewa = 3;

        peminjaman1.tampilkanDataPeminjaman();

    }
}
