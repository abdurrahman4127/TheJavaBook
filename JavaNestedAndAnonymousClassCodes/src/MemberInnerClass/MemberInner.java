package MemberInnerClass;

//A non-static class that is created inside a class but outside

class Outer {
    private int p = 100;

    class Inner {
        void printIn() {
            System.out.println("inside inner : " + p); //private member is accessible inside inner classes
        }
    }
}

public class MemberInner {
    public static void main(String[] args)
    {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.printIn();
    }
}