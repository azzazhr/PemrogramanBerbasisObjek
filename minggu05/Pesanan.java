package minggu05;

public class Pesanan {
    private int idPesanan;
    private Menu menuDipesan; // Hanya satu menu
    private PelangganResto pelanggan;
    private Pelayan pelayan;
    private double totalHarga;

    public Pesanan(int idPesanan, PelangganResto pelanggan, Pelayan pelayan) {
        this.idPesanan = idPesanan;
        this.pelanggan = pelanggan;
        this.pelayan = pelayan;
        this.menuDipesan = pelanggan.getPesanan();
        hitungTotalHarga();
    }

    public int getIdPesanan() {
        return idPesanan;
    }

    public void setIdPesanan(int idPesanan) {
        this.idPesanan = idPesanan;
    }

    public Menu getMenuDipesan() {
        return menuDipesan;
    }

    public PelangganResto getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(PelangganResto pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Pelayan getPelayan() {
        return pelayan;
    }

    public void setPelayan(Pelayan pelayan) {
        this.pelayan = pelayan;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void hitungTotalHarga() {
        totalHarga = menuDipesan.getHarga();
    }

    public String getInfoPesanan() {
        return "Pesanan ID: " + idPesanan + ", Total Harga: " + totalHarga + ", Dilayani oleh: " + pelayan.getNama();
    }

    public void tampilkanPesanan() {
        System.out.println("=============================================================");
        System.out.println("                      DETAIL PEMESANAN                       ");
        System.out.println("=============================================================");
        System.out.println("Pelanggan " + pelanggan.getNama() + " memesan:");
        System.out.println(menuDipesan.getInfo());
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("=============================================================");
    }
}
