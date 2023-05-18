//can't finalize any abstract class/method

abstract class One {
    One() {
        System.out.println("constructor of one");
    }

    abstract void call();

    void call2() {
        System.out.println("This is a concrete method");
    }
}

class Two extends One {
    @Override
    void call() {
        System.out.println("Two's implementation of call");
    }

    void call3() {
        System.out.println("call 3");
    }
}


public class Abstract {
    public static void main(String[] args)
    {
        Two two = new Two(); //goes to the constructor of the parents class
        two.call();
        two.call2();

        One one = new Two();
        //one.call3();  //not allowed; compile time error. if still wanna use, go for "casting"
        ((Two)one).call3(); //casting 'one' variable to 'Two' type
    }
}
