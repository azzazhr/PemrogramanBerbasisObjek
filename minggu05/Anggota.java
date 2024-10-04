package minggu05;

public class Anggota {
    private String nama;
    private String anggotaId;

    public Anggota(String nama, String anggotaId) {
        this.nama = nama;
        this.anggotaId = anggotaId;
    }

    public void info() {
        System.out.println("Anggota [Nama: " + nama + ", ID Anggota: " + anggotaId + "]");
    }
}
