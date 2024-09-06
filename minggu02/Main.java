package minggu02;

public class Main {
    public static void main(String[] args) {
        Mhs mahasiswa = new Mhs("Budi", 123456);
        MataKuliah mataKuliah = new MataKuliah("IF-101", "Pemrograman Java");
        Dosen dosen = new Dosen("Dr. Ani", "Pemrograman Java");

        Nilai nilai = new Nilai(mahasiswa, mataKuliah, dosen, 90.5);

        nilai.tampilkanInfo();
    }
}
