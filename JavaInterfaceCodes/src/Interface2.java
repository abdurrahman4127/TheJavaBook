//interface-interface -> extends
//class-interface -> implement

interface Student {
    int f = 0;

    void A();
    void R();
}

//one interface can extend other Interface
interface Teacher extends Student {
    void ar();
}

class NormalClass {
    void insideNormal() {
        System.out.println("Inside Normal");
    }
}

//we can inherit from a concrete class using extend before implementing
// must override; if don't want, make it abstract too.

class Implement extends NormalClass implements Student, Teacher {
    @Override
    public void A() {
        System.out.println("inside A ");
    }

    @Override
    public void R() {
        System.out.println("inside R ");
    }

    @Override
    public void ar() {
        System.out.println("inside ar ");
    }
}

abstract class Implement2 implements Student, Teacher {
    //tryna implement it without overriding
    //using abstract keyword
}

public class Interface2 {
    //
}
