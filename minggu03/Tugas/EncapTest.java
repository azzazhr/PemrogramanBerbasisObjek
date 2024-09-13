package minggu03.Tugas;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("Janes");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());

        encap.setAge(16); // Coba nilai kurang dari 18
        System.out.println("Age : " + encap.getAge());

        encap.setAge(25); // Coba nilai di antara 18 dan 30
        System.out.println("Age : " + encap.getAge());
    }
}
