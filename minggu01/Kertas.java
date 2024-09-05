public class Kertas {
    private String jenis;
    private String ukuran;
    private String warna;
    private double panjang;
    private double lebar;

    public Kertas(String jenis, String ukuran, String warna, double panjang, double lebar) {
        this.jenis = jenis;
        this.ukuran = ukuran;
        this.warna = warna;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void menghitungLuasKertas() {
        double luas = panjang * lebar;
        System.out.println("Luas kertas: " + luas + " cm²");
    }

    public void cetakInformasi() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Warna: " + warna);
        System.out.println("Panjang: " + panjang + " cm");
        System.out.println("Lebar: " + lebar + " cm");
    }

    public void ubahUkuran(double panjangBaru, double lebarBaru) {
        this.panjang = panjangBaru;
        this.lebar = lebarBaru;
    }
}
