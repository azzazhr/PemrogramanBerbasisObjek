
package minggu02;

import java.util.Scanner;

public class TampilPersegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = scanner.nextInt();
        System.out.println("==================================");

        Persegi persegi = new Persegi(sisi);

        persegi.dataPersegi();

        int luas = persegi.luasPersegi();
        System.out.println("Luas persegi: " + luas);

        int keliling = persegi.kelilingPersegi();
        System.out.println("Keliling persegi: " + keliling);

        scanner.close();

    }
}
