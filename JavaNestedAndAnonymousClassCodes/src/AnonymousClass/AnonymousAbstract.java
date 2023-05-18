package AnonymousClass;

//abstract class
abstract class Person1 {
   abstract void eat();
}

public class AnonymousAbstract {
    public static void main(String[] args)
    {
        //anonymous class
        Person1 p = new Person1() {
            void eat()
            {
                System.out.println("nice fruits");
            }
        };

        p.eat();
    }
}
