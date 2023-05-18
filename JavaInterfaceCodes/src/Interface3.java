interface One1 {
    public void X();  // public is not needed, btw
}

interface Two2 extends One1 {
    String name2 = "Thao Nhi";
    void Y();
}

//implementing
class Three3 implements Two2 {
    public void X() {
        System.out.println("Three");
    }

    public void Y() {
        System.out.println("Two2");
    }
}

public class Interface3 {
    public static void main(String[] args)
    {
        Three3 three3 = new Three3();
        System.out.println(three3.name2);
        three3.Y();
    }
}
