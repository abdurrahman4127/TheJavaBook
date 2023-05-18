package AnonymousClass;

// interface : all methods are by default public
interface Eatable {
    void eat();
}

public class AnonymousInterface {
    public static void main(String[] args)
    {
        //object of anonymous class referred by eatable
        Eatable eatable = new Eatable() {
            public void eat()
            {
                System.out.println("nice fruits");
            }
        };

        eatable.eat();
    }
}

