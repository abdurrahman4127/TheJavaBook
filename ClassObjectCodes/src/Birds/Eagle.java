package Birds;

public class Eagle extends Bird{
    // invisibly every public members are here
    // Only the default constructor gets inherited

    public String name;
    public int wings;
    public int beaks;
    public float size;


    public String color; // Unique

    public Eagle() {
        super();
    }

    public Eagle(String name, float size) {
        super(name, size);
    }

    public Eagle(String name, int wings, int beaks, int size, String color) {
        // super came from parent class
        super.name = name;
        super.wings = wings;
        super.beaks = beaks;
        super.size = size;

        //this refers to current class
        this.color = color;
    }


}
