package minggu06;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private final int TARIF_SKS = 120000; // Contoh tarif per SKS

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji() {
        return this.jumlahSKS * TARIF_SKS;
    }
}
