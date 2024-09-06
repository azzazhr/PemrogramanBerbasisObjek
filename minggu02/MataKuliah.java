package minggu02;

public class MataKuliah {
    private String kode;
    private String nama;

    public MataKuliah(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Mata Kuliah: " + kode);
        System.out.println("Nama Mata Kuliah: " + nama);
    }
}
