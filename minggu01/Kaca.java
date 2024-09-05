public class Kaca {
    private String jenis;
    private double ketebalan;
    private String bentuk;
    private double panjang;
    private double lebar;

    public Kaca(String jenis, double ketebalan, String bentuk, double panjang, double lebar) {
        this.jenis = jenis;
        this.ketebalan = ketebalan;
        this.bentuk = bentuk;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void menghitungLuasKaca() {
        double luas = panjang * lebar;
        System.out.println("Luas kaca: " + luas + " cm²");
    }

    public void menghitungKetebalanKaca() {
        System.out.println("Ketebalan kaca: " + ketebalan + " mm");
    }

    public void cetakInformasi() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Ketebalan: " + ketebalan + " mm");
        System.out.println("Bentuk: " + bentuk);
        System.out.println("Panjang: " + panjang + " cm");
        System.out.println("Lebar: " + lebar + " cm");
    }

    public void ubahBentuk(String bentukBaru) {
        this.bentuk = bentukBaru;
    }
}
