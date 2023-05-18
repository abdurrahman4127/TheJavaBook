package Polymorphism;

public class Main {
    public static void main(String[] args)
    {
//        BOX b = new  BOX(10,5,8);
//        System.out.println("vol of b : " + b.getVolume());
//
//        BOX b1 = new  BOX(5); //calling the 2nd constructor
//        System.out.println("vol of b1 : " + b1.getVolume());

        /*
        //compile time - run time; objects get created when code runs
        Animals a = new Birds();
        a.sleep();
        Horses h = new Horses();
        h.sleep();

        // a.fly(); won't work since in compile-time, there's no methode in that name inside the reference of  Animal class.
        // to make it word, we gotta cast the reference-object

        (( Birds)a).fly(); //casting  Animal class reference into  Bird class

         */

        AnimaLs a = new AnimaLs();  //animal is created
        Birds b = new Magpie(); //constructor call first // Animal is created,  Bird is created, magpie is created

        // casting b variable to  Magpie class and assigning it to  Magpie class
        Magpie c = (Magpie)b; //no output

        a.fly();  //don't know if i can fly
        b.fly();  // magpie is flying
        ((Magpie)b).fly(15);  //magpie is flying at speed 15

        a.eat();   //eating
        b.eat();   //magpie is eating
        c.eat();   //magpie is eating
    }
}
