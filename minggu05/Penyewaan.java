package minggu05;

public class Penyewaan {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Penyewaan() {
        this.pelanggan = new Pelanggan();
        this.mobil = new Mobil();
        this.sopir = new Sopir();
        this.hari = 0;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public Sopir getSopir() {
        return sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHari() {
        return hari;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }

    public void tampilkanInformasi() {
        System.out.println("=======================================");
        System.out.println("           DETAIL PENYEWAAN            ");
        System.out.println("=======================================");
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());
        System.out.println("Merk Mobil: " + mobil.getMerk());
        System.out.println("Nama Sopir: " + sopir.getNama());
        System.out.println("Lama Hari: " + hari);
        System.out.println("Biaya Total: " + hitungBiayaTotal());
        System.out.println("=======================================");
    }
}
