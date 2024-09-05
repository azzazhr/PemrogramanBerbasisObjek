public class MobilManual {
    private String merek;
    private String warna;
    private int tahun;
    private int kapasitasMesin;
    private int jumlahGigi;

    public MobilManual(String merek, String warna, int tahun, int kapasitasMesin, int jumlahGigi) {
        this.merek = merek;
        this.warna = warna;
        this.tahun = tahun;
        this.kapasitasMesin = kapasitasMesin;
        this.jumlahGigi = jumlahGigi;
    }

    public void menghitungJarakTempuh() {
        System.out.println("Jarak tempuh maksimal: " + (kapasitasMesin * 10) + " km");
    }

    public void cetakInformasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " cc");
        System.out.println("Jumlah Gigi: " + jumlahGigi);
    }

    public void ubahJumlahGigi(int jumlahGigiBaru) {
        this.jumlahGigi = jumlahGigiBaru;
    }
}
