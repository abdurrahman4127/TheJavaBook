package Birds;

public class Penguin extends Bird{
 /*
    by default, everything from Bird class has been inherited
     invisibly every public members are here
     Only the default constructors gets inherited
 */

    public String name;
    public int wings;
    public float size;

    // to override or modify the parent class method
    @Override
    public void fly() {
        System.out.println(name + " is a Penguin. It can NOT fly!");
    }
}
