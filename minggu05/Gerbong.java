package minggu05;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1)); // Menggunakan nomor kursi sebagai String
        }
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    public String info() {
        StringBuilder info = new StringBuilder("Kode: " + kode + "\n");
        for (Kursi kursi : arrayKursi) {
            info.append(kursi.info());
        }
        return info.toString();
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        if (nomor > 0 && nomor <= arrayKursi.length) {
            if (this.arrayKursi[nomor - 1].getPenumpang() == null) {
                this.arrayKursi[nomor - 1].setPenumpang(penumpang);
            } else {
                System.out.println("Kursi nomor " + nomor + " sudah terisi.");
            }
        } else {
            System.out.println("Nomor kursi tidak valid.");
        }
    }

}
