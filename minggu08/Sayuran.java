package minggu08;

public class Sayuran extends Tanaman {
    public Sayuran() {
        super("Sayuran", 3, 5, 10000); // waktu panen 3 hari, kebutuhan air 5 liter, harga panen 10000
    }

    @Override
    public void panen(Pemain pemain) {
        if (siapPanen()) { // Cek apakah tanaman siap dipanen
            if (!siapPanen) { // Cek apakah tanaman sudah dipanen sebelumnya
                pemain.tambahUang(hargaPanen);
                System.out.println("Anda mendapatkan uang sebesar " + hargaPanen + " dari panen " + this.nama);
                System.out.println("==============================");
                System.out.println("Total Uang Anda sekarang: " + pemain.getUang());
                System.out.println("==============================");
                this.siapPanen = true; // Tandai bahwa tanaman ini sudah dipanen
            } else {
                System.out.println(this.nama + " sudah dipanen sebelumnya."); // Menampilkan pesan sudah dipanen
            }
        } else {
            System.out.println(this.nama + " belum siap dipanen."); // Menampilkan pesan belum siap dipanen
        }
    }

}