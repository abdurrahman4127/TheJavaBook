package Car;

public class Main {
    public static void main(String[] args)
    {
        Car mercedes = new Car();

        mercedes.color = "Black";
        mercedes.model = "MI6";
        mercedes.speed = 102;
        mercedes.wheel = 4;

        mercedes.start();
        System.out.println(mercedes.color);
    }
}
