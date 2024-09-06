package minggu02;

public class Mhs {
    private String nama;
    private int nim;

    public Mhs(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNim() {
        return nim;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
    }
}
