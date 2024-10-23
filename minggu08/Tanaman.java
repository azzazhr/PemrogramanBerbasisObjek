package minggu08;

public class Tanaman {
    protected String nama;
    protected int waktuPanen;
    protected int kebutuhanAir;
    protected boolean siapPanen;
    protected int hariHinggaPanen; // Hari estimasi panen
    protected int hariTumbuh; // Hari yang telah berlalu
    protected int hargaPanen;
    protected boolean terkenaHama;

    public Tanaman(String nama, int hariHinggaPanen, int kebutuhanAir, int hargaPanen) {
        this.nama = nama;
        this.hariHinggaPanen = hariHinggaPanen;
        this.kebutuhanAir = kebutuhanAir;
        this.siapPanen = false;
        this.hariTumbuh = 0;
        this.hargaPanen = hargaPanen;
        this.terkenaHama = false;
    }

    public String getNama() {
        return nama;
    }

    public void tumbuh(Cuaca cuaca) {
        int pengaruhCuaca = cuaca.pengaruhTerhadapPertumbuhan();
        if (pengaruhCuaca == -1) {
            System.out.println("Cuaca panas! Pertumbuhan terhambat.");
        } else if (pengaruhCuaca == 2) {
            System.out.println("Cuaca hujan! Pertumbuhan lebih cepat.");
        }

        hariTumbuh += pengaruhCuaca;

        if (hariTumbuh >= hariHinggaPanen) {
            siapPanen = true;
            hariTumbuh = hariHinggaPanen; // Jangan melebihi hari panen
        }
    }

    public void siram() {
        if (siapPanen) {
            System.out
                    .println("Maaf, " + nama + " sudah dipanen. Silahkan tanam tanaman baru jika ingin menyiram lagi.");
        } else {
            System.out.println(nama + " disiram.");
        }
    }

    public void pupuk() {
        if (siapPanen) {
            System.out
                    .println("Maaf, " + nama + " sudah dipanen. Silahkan tanam tanaman baru jika ingin memupuk lagi.");
        } else {
            System.out.println(nama + " dipupuk.");
        }
    }

    public int getHargaPanen() {
        return hargaPanen;
    }

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

    public boolean isSudahDipanen() {
        return siapPanen; // Atau atribut lain yang Anda gunakan untuk menandai sudah dipanen
    }

    public int getHariHinggaPanen() {
        return hariHinggaPanen;
    }

    public void kurangiHariHinggaPanen() {
        if (hariTumbuh < hariHinggaPanen) {
            hariTumbuh++;
        }
    }

    public boolean siapPanen() {
        return hariTumbuh >= hariHinggaPanen;
    }

    public void tambahHariTumbuh() {
        this.hariTumbuh++;
    }

    public void tampilkanStatus() {
        System.out.println("Tanaman: " + nama);

        // Menghitung hari hingga panen yang tersisa
        int sisaHari = hariHinggaPanen - hariTumbuh;
        if (sisaHari > 0) {
            System.out.println("Hari hingga panen: " + sisaHari);
        } else {
            System.out.println("Hari hingga panen: 0");
        }

        // Menampilkan status siap panen atau belum
        if (siapPanen()) {
            System.out.println("Status: Siap dipanen");
        } else {
            System.out.println("Status: Belum siap dipanen");
        }
    }

    public boolean isTerkenaHama() {
        return terkenaHama;
    }

    public void setTerkenaHama(boolean terkenaHama) {
        this.terkenaHama = terkenaHama;
    }

    // Metode untuk menampilkan status hama
    public void tampilkanStatusHama() {
        if (terkenaHama) {
            System.out.println("Tanaman terkena hama!");
            System.out.println("==============================");
        } else {
            // Tampilkan status normal lainnya
            System.out.println("Tanaman sehat.");
            System.out.println("==============================");
        }
    }
}