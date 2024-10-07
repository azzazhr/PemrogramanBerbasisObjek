package minggu06;

public class MainTugasJb6 {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("001", "Dr. Budi", "Malang");
        dosen1.setSKS(12);

        Dosen dosen2 = new Dosen("002", "Prof. Andi", "Surabaya");
        dosen2.setSKS(15);

        DaftarGaji daftarGaji = new DaftarGaji(10);
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        daftarGaji.printSemuaGaji();
    }
}
