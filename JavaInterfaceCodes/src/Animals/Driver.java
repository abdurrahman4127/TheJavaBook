package Animals;

public class Driver {
    public static void main (String[] args)
    {
        Dog dog = new Dog();
        dog.canBark();
        dog.canSwim();
        dog.hasTail();

        Crocodile crocodile = new Crocodile();
        crocodile.canBark();
        crocodile.canSwim();
        crocodile.hasTail();

        Animal crow = new Crow();
        crow.canBark();
        crow.canSwim();
        crow.hasTail();
    }
}
