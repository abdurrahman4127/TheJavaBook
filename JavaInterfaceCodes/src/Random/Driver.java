package Random;

public class Driver {
    public static void main(String[] args) {
/*
        Vehicle v1 = new Vehicle();
        v1.name = "Gari";
        v1.wheels = 4;
        v1.speed = 50;

        System.out.println("Vehicle's speed: " + v1.speed);
        v1.increaseSpeed(100);
        System.out.println("Vehicle's new speed: " + v1.speed);
*/

        Car toyota = new Car();
        toyota.name = "Allin";
        toyota.wheels = 4;
        toyota.speed = 100;
        toyota.color = "Silver";

        toyota.increaseSpeed(200);
        System.out.println(toyota.name + " new speed: " + toyota.speed);
        toyota.runsOn();

        Vehicle v1 = new Car();
        v1.runsOn();

        Vehicle v2 = new Ship();
        v2.runsOn();

        Tiger t1 = new Tiger();
        t1.run();
        t1.animalSound();

/*
        Animal t3 = new Tiger();
        t3.run();
        t3.animalSound();
*/

        Horse h1 = new Horse();
        h1.run();
        h1.animalSound();
        h1.sleeping();
    }
}
