public class Mobil extends MobilMatic {
    private int jumlahGigi;
    private String tipeTransmisi;

    public Mobil(String merek, String warna, int tahun, int kapasitasBensin, String jenisTransmisi, int jumlahGigi,
            String tipeTransmisi) {
        super(merek, warna, tahun, kapasitasBensin, jenisTransmisi);
        this.jumlahGigi = jumlahGigi;
        this.tipeTransmisi = tipeTransmisi;
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Jumlah Gigi: " + jumlahGigi);
        System.out.println("Tipe Transmisi: " + tipeTransmisi);
    }

    public void ubahJumlahGigi(int jumlahGigiBaru) {
        this.jumlahGigi = jumlahGigiBaru;
    }

    public void ubahTipeTransmisi(String tipeTransmisiBaru) {
        this.tipeTransmisi = tipeTransmisiBaru;
    }
}
