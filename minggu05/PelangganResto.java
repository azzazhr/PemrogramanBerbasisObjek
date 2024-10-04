package minggu05;

public class PelangganResto {
    private String nama;
    private int noMeja;
    private Menu pesanan;

    public PelangganResto(String nama, int noMeja) {
        this.nama = nama;
        this.noMeja = noMeja;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNoMeja() {
        return noMeja;
    }

    public void setNoMeja(int noMeja) {
        this.noMeja = noMeja;
    }

    public void pesan(Menu menu) {
        this.pesanan = menu;
        System.out.println(nama + " memesan " + menu.getInfo());
    }

    public Menu getPesanan() {
        return pesanan;
    }
}
