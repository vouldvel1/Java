import Extd.Shape;
import Extd.Square;
import Extd.Triangle;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Меги", "Золотистый ретривер", 39.5f, 10);

        Square shape = new Square(10, 20);
        Triangle triangle = new Triangle(10, 20, 5);

        Print(shape);
        Print(triangle);

//        dog.Run();

    }

    private static void Print(Shape shape) {
        System.out.printf("a = %1$s\n" +
                "b = %2$s\n" +
                "P = %3$s", shape.getA(), shape.getB(), shape.Perimeter());
    }
}