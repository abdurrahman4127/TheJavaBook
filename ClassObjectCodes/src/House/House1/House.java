package House.House1;

public class House {
    public String name;
    public int windows;
    public int doors;
    public String location;
    public int floor;


    public void namePlate() {
        System.out.println("this is a " + this.name);
    }


    public House() {   //default values
        this.doors = 2;
        this.windows = 4;
        this.name = "New Structure";
    }


    public House(String name, int floor) {
        this.name = name;
        this.floor = floor;
    }
}
