public class Dog {

    String name;
    String breed;
    float weight;
    float speed;


    public Dog(String name, String breed, float weight, float speed){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
    }


    public String GetInfo() {
        return String.format("Имя: %1$s\n" +
                "Порода: %2$s\n" +
                "Вес: %3$s", name, breed, weight);
    }

    public void Run(){
        for(int i = 0 ; i < speed ; i++){
            System.out.println("Бегу!!");
        }
    }
}
