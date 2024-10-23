package minggu08;

import java.util.Random;

public class Cuaca {
    private String kondisiCuaca;

    // Daftar kondisi cuaca yang mempengaruhi pertumbuhan tanaman
    private String[] cuaca = { "Panas", "Hujan" };

    public Cuaca() {
        acakCuaca(); // Inisialisasi dengan cuaca acak
    }

    public void acakCuaca() {
        Random rand = new Random();
        kondisiCuaca = cuaca[rand.nextInt(cuaca.length)];
    }

    public String getKondisiCuaca() {
        return kondisiCuaca;
    }

    // Menentukan pengaruh cuaca terhadap pertumbuhan tanaman
    public int pengaruhTerhadapPertumbuhan() {
        switch (kondisiCuaca) {
            case "Panas":
                return 1; // Pertumbuhan normal
            case "Hujan":
                return 2; // Pertumbuhan cepat
            default:
                return 0;
        }
    }

    public void tampilkanCuaca() {
        System.out.println("Cuaca hari ini: " + kondisiCuaca);

    }
}
