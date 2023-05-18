package StaticNestedClass;

public class StaticInner {
    static int data = 30;

    static class Inner {
        void msg() {
            System.out.println("data is " + data);
        }

        static void msg(String msg) {
            System.out.println(msg);
        }
    }

    // main
    public static void main(String[] args)
    {
        Inner obj = new Inner();
        obj.msg();
        Inner.msg("Hello"); //no need to create the instance of static nested class
    }
}
