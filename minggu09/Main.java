package minggu09;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Rectangle
        Shape rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        // Membuat objek Circle
        Shape circle = new Circle(4);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}
