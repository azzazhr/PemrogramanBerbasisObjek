package minggu02;

public class Dosen {
    private String nama;
    private String mataKuliah;

    public Dosen(String nama, String mataKuliah) {
        this.nama = nama;
        this.mataKuliah = mataKuliah;
    }

    public String getNama() {
        return nama;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Mata Kuliah: " + mataKuliah);
    }
}
