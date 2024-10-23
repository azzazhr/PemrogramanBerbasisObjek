package minggu08;

public class Toko {
    public void beliBarang(Pemain pemain, String barang) {
        if (barang.equals("Pupuk")) {
            if (pemain.getUang() >= 10000) {
                pemain.kurangiUang(10000);
                System.out.println("Anda membeli pupuk. Uang tersisa: " + pemain.getUang());
            } else {
                System.out.println("Uang tidak cukup untuk membeli pupuk.");
            }
        } else if (barang.equals("Pestisida")) {
            if (pemain.getUang() >= 15000) {
                pemain.kurangiUang(15000);
                System.out.println("Anda membeli pestisida. Uang tersisa: " + pemain.getUang());
            } else {
                System.out.println("Uang tidak cukup untuk membeli bibit Padi.");
            }
        }
    }
}