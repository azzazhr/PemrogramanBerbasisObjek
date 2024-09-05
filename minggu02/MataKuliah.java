package minggu02;

public class MataKuliah {
    private int kode;
    private String namaMataKuliah;

    public MataKuliah(int kode, String namaMataKuliah) {
        this.kode = kode;
        this.namaMataKuliah = namaMataKuliah;
    }

    public int getKode() {
        return kode;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }
}
