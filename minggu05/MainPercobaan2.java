package minggu05;

public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setMerk("Avanza");
        m.setBiaya(350000);

        Sopir s = new Sopir();
        s.setNama("John Doe");
        s.setBiaya(200000);

        Pelanggan p = new Pelanggan();
        p.setNama("Jane");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);

        Penyewaan penyewaan = new Penyewaan();
        penyewaan.setPelanggan(p);
        penyewaan.setMobil(m);
        penyewaan.setSopir(s);
        penyewaan.setHari(2);

        penyewaan.tampilkanInformasi();

    }
}
