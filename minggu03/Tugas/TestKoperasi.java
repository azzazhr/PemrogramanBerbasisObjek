package minggu03.Tugas;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPeminjaman());

        int jumlahPinjaman;
        do {
            System.out.print("\nMasukkan jumlah uang yang ingin dipinjam: ");
            jumlahPinjaman = input.nextInt();
            if (jumlahPinjaman > donny.getLimitPeminjaman()) {
                System.out.println("Jumlah pinjaman melebihi limit. Silakan masukkan jumlah yang sesuai.");
            }
        } while (jumlahPinjaman > donny.getLimitPeminjaman());

        donny.pinjam(jumlahPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        int jumlahAngsuran;
        do {
            System.out.print("\nMasukkan jumlah angsuran yang ingin dibayar: ");
            jumlahAngsuran = input.nextInt();
            float minimalAngsuran = donny.getJumlahPinjaman() * 0.1f;
            if (jumlahAngsuran < minimalAngsuran) {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
            }
        } while (jumlahAngsuran < donny.getJumlahPinjaman() * 0.1f);

        donny.angsur(jumlahAngsuran);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        input.close();
    }
}
