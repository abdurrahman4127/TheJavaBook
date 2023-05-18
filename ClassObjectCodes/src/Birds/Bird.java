package Birds;

public class Bird {
    public String name;
    public int wings;
    public int beaks;
    public float size;

    //Default Constructor
    public Bird() {
        this.wings = 2;
        this.beaks = 1;
    }

    // Overloaded Constructor 1
    public Bird(String name) {
        this.wings = 2;
        this.beaks = 1;
        this.name = name;
    }

    // Overloaded Constructor 2
    public Bird(String name, float size) {
        this.wings = 2;
        this.beaks = 1;
        this.name = name;
        this.size = size;
    }

    // member method
    public void fly() {
        System.out.println(this.name + " can fly.");
    }
}
