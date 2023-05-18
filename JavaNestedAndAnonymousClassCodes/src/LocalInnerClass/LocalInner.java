package LocalInnerClass;

// it is possible to access the non-final local variable in local inner class.

public class LocalInner {
    private int data = 30; //instance variable

    void display() {
        int value = 50; //local variable must be final till jdk 1.7 only

        class Local {
            void msg() {
                System.out.println(value);
                System.out.println(LocalInner.this.data);
            }
        }

        Local l = new Local();
        l.msg();
    }

    // main
    public static void main(String[] args)
    {
        LocalInner obj = new LocalInner();
        obj.display();
    }
}