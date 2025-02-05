public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Меги", "Золотистый ретривер", 39.5f, 10);

        System.out.println(dog.GetInfo());

        dog.Run();

    }
}