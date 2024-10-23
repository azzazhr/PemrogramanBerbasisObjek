package minggu08;

public class Jagung extends Tanaman {
    public Jagung() {
        super("Jagung", 7, 8, 15000); // waktu panen 7 hari, kebutuhan air 8 liter
    }

    @Override
    public void panen(Pemain pemain) {
        if (siapPanen()) { // Jika tanaman siap dipanen
            if (!siapPanen) { // Pastikan tanaman belum dipanen
                pemain.tambahUang(hargaPanen);
                System.out.println("Anda mendapatkan uang sebesar " + hargaPanen + " dari panen " + this.nama);
                System.out.println("==============================");
                System.out.println("Total Uang Anda sekarang: " + pemain.getUang());
                System.out.println("==============================");
                this.siapPanen = true; // Tandai bahwa tanaman ini sudah dipanen
            } else {
                System.out.println(this.nama + " sudah dipanen sebelumnya.");
            }
        } else {
            System.out.println(this.nama + " belum siap dipanen.");
        }
    }
}
