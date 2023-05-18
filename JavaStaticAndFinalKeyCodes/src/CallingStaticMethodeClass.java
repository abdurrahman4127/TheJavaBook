class Students {
    String name;
    int rollNo;

    static String varsityName = "UIU";

    public Students(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    static void staticMethode() {
//        System.out.println(this.name + " in staticMethode();"); //this means calling object;
        System.out.println(varsityName);
//        System.out.println(name); // not allowed as non-static attributes cannot be referenced from static methods
    }
}

public class CallingStaticMethodeClass {
    public static void main(String[] args)
    {
        Students ar = new Students("Abdur Rahman", 7);

        // can't access non-static property inside a static methode/class
        Students.staticMethode(); //we're calling using class, so 'this' key doesn't exit.
    }
}
