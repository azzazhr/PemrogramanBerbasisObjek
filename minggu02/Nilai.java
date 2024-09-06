package minggu02;

public class Nilai {
    private Mhs mahasiswa;
    private MataKuliah mataKuliah;
    private Dosen dosen;
    private double nilai;

    public Nilai(Mhs mahasiswa, MataKuliah mataKuliah, Dosen dosen, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
        this.nilai = nilai;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama() + " (" + mahasiswa.getNim() + ")");
        System.out.println("Mata Kuliah: " + mataKuliah.getNama() + " (" + mataKuliah.getKode() + ")");
        System.out.println("Dosen: " + dosen.getNama() + " (Mengajar: " + dosen.getMataKuliah() + ")");
        System.out.println("Nilai: " + nilai);
    }
}
