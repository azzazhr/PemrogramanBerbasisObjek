package minggu08;

public class Pemain {
    private String nama;
    private int uang;
    private int energi;
    private String[] inventori;
    private int pupuk;
    private int pestisida;

    public Pemain(String nama) {
        this.nama = nama;
        this.uang = 100000; // Uang awal
        this.energi = 100; // Energi awal
        this.inventori = new String[10]; // Kapasitas inventori 10 slot
        this.pupuk = 3;
        this.pestisida = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getUang() {
        return uang;
    }

    public int getEnergi() {
        return energi;
    }

    public void tambahUang(int jumlah) {
        this.uang += jumlah;
        System.out.println("Uang Anda sekarang: " + uang);
    }

    public void kurangiUang(int jumlah) {
        this.uang -= jumlah;
    }

    public void tambahEnergi(int jumlah) {
        if (energi + jumlah > 100) {
            energi = 100; // Maksimal energi adalah 100
        } else {
            energi += jumlah;
        }
    }

    public void kurangiEnergi(int jumlah) {
        if (energi - jumlah < 0) {
            energi = 0; // Energi tidak bisa kurang dari 0
        } else {
            energi -= jumlah;
        }
    }

    public void tambahKeInventori(String barang) {
        for (int i = 0; i < inventori.length; i++) {
            if (inventori[i] == null) {
                inventori[i] = barang;
                System.out.println(barang + " telah ditambahkan ke inventori.");
                return;
            }
        }
        System.out.println("Inventori penuh! Tidak bisa menambahkan " + barang + ".");
    }

    public void lihatInventori() {
        System.out.println("Isi inventori:");
        for (int i = 0; i < inventori.length; i++) {
            if (inventori[i] != null) {
                System.out.println("- " + inventori[i]);
            }
        }
    }

    public boolean gunakanPupuk() {
        if (pupuk > 0) {
            pupuk--;
            return true;
        } else {
            System.out.println("Pupuk habis, silakan beli pupuk di toko.");
            return false;
        }
    }

    public void tambahPupuk(int jumlah) {
        this.pupuk += jumlah;
    }

    public int getPupuk() {
        return pupuk;
    }

    public void pulihkanEnergi(int jumlah) {
        this.energi += jumlah;
        if (this.energi > 100) { // Misalnya batas maksimal energi 100
            this.energi = 100;
        }
    }

    public void tambahPestisida(int jumlah) {
        this.pestisida += jumlah;
    }

    public boolean gunakanPestisida() {
        if (this.pestisida > 0) {
            this.pestisida--;
            return true;
        } else {
            return false;
        }
    }

    public int getPestisida() {
        return pestisida;
    }
}