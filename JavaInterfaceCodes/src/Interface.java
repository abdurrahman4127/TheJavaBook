// can't have concrete methods; all abstract methods
//can't have constructor
//variable must be initialize as it is by default public, static and final
//variable type -> 'public static final' and of abstract type
//can't create object of interface
//can't extend but implement

interface InterfaceClass {
    // int f; //declaration without initialization is not allowed;
    //initialize it here; as it's public but can't be accessed via constructor
   //public static final int f = 7; //is same

    int f = 7;
    void method(); //don't need to add abstract keyword
    void method2(); //access modifier : public; so when overriding, public keyword must be mentioned
}

//methode must be overridden to get rid of error
class  Implementation implements InterfaceClass {
    @Override
    public void method() {  //must add 'public' keyword
        System.out.println("methode 1");
    }

    @Override
    public void method2() {
        System.out.println("methode 2");
    }
}

public class Interface {
    public static void main(String[] args)
    {
//        InterfaceClass a = new Implementation();
//        a.method();
//
//        System.out.println(a.f); //static should be accessed with class name; but with object name
//        System.out.println(InterfaceClass.f);
//        System.out.println(Implementation.f); //should be accessed using class name

//        //lower part
        Bird b = new Bird();
        b.fly();
    }
}

//attributes are by default :  public, static and final
interface Flyable {
    String media = "Sky";
    void fly();
    boolean needFuel();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird can fly in the " + Flyable.media);
//        System.out.println("Bird can fly in the " + media);  //both are same
    }

    @Override
    public boolean needFuel() {
        return false;
    }
}