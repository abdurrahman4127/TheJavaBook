package StaticNestedClass;

class Outer {
    static String outer = "String inside outer";

    static class StaticClass {
        void method() {
            System.out.println("from static inner : " + outer);
        }

        void methodString(String s) {
            System.out.println(s);
        }

        public StaticClass() {
            System.out.println();
        }

        public StaticClass(String s) {
            System.out.println(s);
        }
    }
}


public class StaticNested {
    public static void main(String[] args)
    {
        Outer.StaticClass inner = new Outer.StaticClass();
        inner.method();

        Outer.StaticClass inner2 = new Outer.StaticClass("passed from main method");
    }
}
