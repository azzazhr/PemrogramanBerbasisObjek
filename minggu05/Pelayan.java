package minggu05;

public class Pelayan {
    private int idPelayan;
    private String nama;

    public Pelayan(int idPelayan, String nama) {
        this.idPelayan = idPelayan;
        this.nama = nama;
    }

    public int getIdPelayan() {
        return idPelayan;
    }

    public void setIdPelayan(int idPelayan) {
        this.idPelayan = idPelayan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void layaniPesanan(Pesanan pesanan) {
        System.out.println("Pelayan " + nama + " melayani pesanan ID: " + pesanan.getIdPesanan());
    }
}
