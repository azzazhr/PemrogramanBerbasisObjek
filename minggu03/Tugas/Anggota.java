package minggu03.Tugas;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private float limitPeminjaman;
    private float jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, float limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return nomorKTP;
    }

    public void setNomorKTP(String nomorKTP) {
        this.nomorKTP = nomorKTP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getLimitPeminjaman() {
        return limitPeminjaman;
    }

    public float getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int jumlah) {
        if (jumlahPinjaman + jumlah > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += jumlah;
        }
    }

    public void angsur(int jumlah) {
        if (jumlah > 0) {
            jumlahPinjaman -= jumlah;
        } else {
            System.out.println("Jumlah angsuran tidak boleh negatif.");
        }
    }
}
