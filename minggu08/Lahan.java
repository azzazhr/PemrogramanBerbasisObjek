package minggu08;

public class Lahan {
    private String jenisTanah;
    private Tanaman[] tanaman;

    public Lahan(String jenisTanah) {
        this.jenisTanah = jenisTanah;
        this.tanaman = new Tanaman[2]; // Anggap maksimal 2 tanaman
    }

    // Metode untuk menanam tanaman
    public void tanamTanaman(Tanaman t, Cuaca cuaca) {
        String musim = cuaca.getKondisiCuaca();
        // Cek apakah ada ruang untuk menanam
        for (int i = 0; i < tanaman.length; i++) {
            if (tanaman[i] == null) {
                tanaman[i] = t; // Tanam tanaman di lahan
                System.out.println("Tanaman " + t.getNama() + " telah ditanam.");
                return;
            }
        }
        System.out.println("Tidak ada ruang untuk menanam tanaman " + t.getNama() + ".");
    }

    public void siramTanaman() {
        for (Tanaman t : tanaman) {
            if (t != null && !t.isSudahDipanen()) { // Cek apakah tanaman belum dipanen
                t.siram();
            }
        }
    }

    public void pupukTanaman() {
        for (Tanaman t : tanaman) {
            if (t != null) {
                t.pupuk();
            }
        }
    }

    public void tumbuhkanTanaman(Cuaca cuaca) {
        for (Tanaman t : tanaman) {
            if (t != null) {
                t.tumbuh(cuaca); // Pengaruh cuaca terhadap pertumbuhan tanaman
            }
        }
    }

    public Tanaman[] getTanaman() {
        return tanaman; // Mengembalikan seluruh array tanaman
    }

    public void kurangiHariPanen() {
        for (Tanaman t : tanaman) {
            if (t != null) {
                t.hariHinggaPanen--; // Kurangi hari hingga panen setiap hari
            }
        }
    }

    public void cekHama(Tanaman[] tanaman) {
        for (Tanaman t : tanaman) {
            if (t != null && !t.isTerkenaHama()) {
                double peluangHama = Math.random(); // Menghasilkan angka acak antara 0.0 dan 1.0
                if (peluangHama < 0.1) { // Misalnya 10% peluang terkena hama
                    t.setTerkenaHama(true);
                    System.out.println(t.getNama() + " terkena hama!");
                }
            }
        }
    }
}
