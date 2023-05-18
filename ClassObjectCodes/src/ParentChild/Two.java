package ParentChild;

//super(parameter); and super(parameterless);
class Two extends One {
    Two()
    {
        System.out.println("Inside  Two");
    }

    Two (String msg) {
        System.out.println("Two : " + msg);
    }
}