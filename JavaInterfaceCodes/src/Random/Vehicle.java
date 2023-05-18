package Random;

public abstract class Vehicle {
    public int wheels;
    public String name;
    public float speed;

    // regular method
    public void increaseSpeed(float speed) {
        this.speed += speed;
    }

    //abstract method
    public abstract void runsOn();
}
