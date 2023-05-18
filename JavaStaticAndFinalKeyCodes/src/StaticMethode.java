class AR {
    static String name = "Abdur Rahman";

    static void name() {
        System.out.println(name);
    }
}

public class StaticMethode {
    /*
     java compiler calls using class name -> StaticMethode.main();
     if it wasn't 'static', we couldn't call it like 'StaticMethode.main();'
     to call non-static methods, we need to create object; but to call static methode, we need class
     if it wasn't static, we'd have to create an object of 'StaticMethode' (i.e. the public class)
     but then we'd be needing to create a constructor and pass parameters; but java compiler doesn't know it
    */

    public static void main(String[] args)
    {
        AR obj = new AR();

        System.out.println(obj.name);
//        obj.name();
    }
}
