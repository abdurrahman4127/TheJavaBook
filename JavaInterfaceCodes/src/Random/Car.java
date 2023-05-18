package Random;

public class Car extends Vehicle {
    // self child variable
    public String color;

    // implementation of abstract method
    @Override
    public void runsOn()
    {
        System.out.println("On the Ground");
    }
}
