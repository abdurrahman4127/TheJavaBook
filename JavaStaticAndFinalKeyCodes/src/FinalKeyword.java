// final variables -> can't change value
// final methods -> can't override; if inherited, child class will have access
// final classes -> can't extend
//can't finalize any abstract class/method

class Final {
    final String name = "Abdur Rahman"; // to use 'final' : either initialize it
    final String anotherName; //or access it only using constructor

    Final(String anotherName) {
        this.anotherName = anotherName;
    }

    void showName() {
        //name = "Another One"; //not allowed
        System.out.println(name);
        System.out.println(anotherName);
    }

    final void finalMethod() { //can't override finalized methods
        System.out.println("inside final method");
    }
}

class Final2 extends Final {
    Final2(String anotherName) {
        super(anotherName);
    }
    //can't override finalized methods
    //final void finalMethod() { System.out.println("overriding"); }
}

//final class can't be extended
final class FinalClass {
    //
}

//class FinalClass2 extends FinalClass
//{
//    //cannot extend final class.
//}

public class FinalKeyword {
    public static void main(String[] args)
    {
        Final f = new Final("L Lawliet");
        f.showName();
    }
}
