package Car;

public class Car {

    // <modifier> <dataType> <attributeName>
    public int wheel;
    public int engine;
    public String manufacturer;
    public String model;
    public String color;
    public float speed = 50;

    // methods
    public void boostSpeed(float askedSpeed) {  // 100
        this.speed = this.speed + askedSpeed;
        System.out.println(this.model + " got new speed at + " + this.speed + " km/h");
    }

    public void start() {
        System.out.println(this.model + " has started");
    }
}
