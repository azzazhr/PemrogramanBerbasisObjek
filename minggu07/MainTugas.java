package minggu07;

public class MainTugas {
    public static void main(String[] args) {
        Manusia dosen = new Dosen();
        Manusia mahasiswa = new Mahasiswa();

        dosen.bernapas();
        mahasiswa.bernapas();

        dosen.makan();
        mahasiswa.makan();

        ((Dosen) dosen).lembur();
        ((Mahasiswa) mahasiswa).tidur();
    }
}
