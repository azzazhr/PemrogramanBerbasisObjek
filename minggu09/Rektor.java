package minggu09;

public class Rektor {
    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlade");
        System.out.println("Selamat! Bagaimana Anda bisa cumlaude?");

        // Memeriksa apakah mahasiswa adalah turunan Mahasiswa untuk memanggil
        // kuliahDiKampus()
        if (mahasiswa instanceof Mahasiswa) {
            ((Mahasiswa) mahasiswa).kuliahDiKampus();
        }

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();

        System.out.println("-------------------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("-------------------------------------------------------");
    }
}
