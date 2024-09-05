public class MobilMatic {
    private String merek;
    private String warna;
    private int tahun;
    private int kapasitasBensin;
    private String jenisTransmisi;

    public MobilMatic(String merek, String warna, int tahun, int kapasitasBensin, String jenisTransmisi) {
        this.merek = merek;
        this.warna = warna;
        this.tahun = tahun;
        this.kapasitasBensin = kapasitasBensin;
        this.jenisTransmisi = jenisTransmisi;
    }

    public void menghitungBensin() {
        System.out.println("Kapasitas bensin: " + kapasitasBensin + " liter");
    }

    public void cetakInformasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println("Kapasitas Bensin: " + kapasitasBensin + " liter");
        System.out.println("Jenis Transmisi: " + jenisTransmisi);
    }

    public void tambahKapasitasBensin(int tambahan) {
        kapasitasBensin += tambahan;
    }
}
