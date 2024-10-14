package minggu07;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total sudut dengan satu sudut: " + segitiga.totalSudut(60));
        System.out.println("Total sudut dengan dua sudut: " + segitiga.totalSudut(60, 45));

        System.out.println("Keliling dengan tiga sisi: " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling dengan dua sisi: " + segitiga.keliling(3, 4));
    }
}
