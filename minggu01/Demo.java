public class Demo {
    public static void main(String[] args) {
        MobilMatic mobilMatic = new MobilMatic("Toyota", "Hitam", 2023, 50, "Otomatis");
        MobilManual mobilManual = new MobilManual("Honda", "Putih", 2022, 1500, 6);
        Kertas kertas = new Kertas("A4", "210x297", "Putih", 21, 29.7);
        Kaca kaca = new Kaca("Tempered", 10, "Persegi", 100, 200);

        mobilMatic.tambahKapasitasBensin(10);
        mobilMatic.cetakInformasi();
        System.out.println("=========================");
        mobilManual.ubahJumlahGigi(5);
        mobilManual.cetakInformasi();
        System.out.println("=========================");
        kertas.ubahUkuran(30, 40);
        kertas.cetakInformasi();
        System.out.println("=========================");
        kaca.ubahBentuk("Lingkaran");
        kaca.cetakInformasi();
    }
}
