package minggu05;

public class MainTugas {
    public static void main(String[] args) {
        Menu menu1 = new Menu("Nasi Goreng", 25000, "Makanan");
        Menu menu2 = new Menu("Es Teh", 5000, "Minuman");
        Menu menu3 = new Menu("Ayam Bakar", 30000, "Makanan");

        // Membuat pelanggan
        PelangganResto pelanggan1 = new PelangganResto("Azzahra Attaqina", 12);
        pelanggan1.pesan(menu1); // Pelanggan memesan satu menu

        PelangganResto pelanggan2 = new PelangganResto("Budi Santoso", 5);
        pelanggan2.pesan(menu3); // Pelanggan memesan satu menu

        // Membuat pelayan
        Pelayan pelayan1 = new Pelayan(101, "Andi");

        // Membuat pesanan
        Pesanan pesanan1 = new Pesanan(1, pelanggan1, pelayan1);
        Pesanan pesanan2 = new Pesanan(2, pelanggan2, pelayan1);

        // Pelayan melayani pesanan
        pelayan1.layaniPesanan(pesanan1);
        pelayan1.layaniPesanan(pesanan2);

        // Menampilkan pesanan
        pesanan1.tampilkanPesanan();
        pesanan2.tampilkanPesanan();
    }
}
