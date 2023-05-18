class Counter {
    int nonStaticCount = 0;  //object specific; not class
    static int staticCount = 0;  //class specific; not object

    Counter() {
        nonStaticCount++; // will add one each time
        staticCount++;  // won't add as it's static

        System.out.println("Static : " + staticCount);
        System.out.println("Non-Static : " + nonStaticCount);
    }
}

public class ObjectCounting_Static {
    public static void main(String[] args)
    {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
