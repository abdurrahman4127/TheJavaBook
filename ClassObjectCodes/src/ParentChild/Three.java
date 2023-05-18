package ParentChild;

class Three extends Two {
    Three() {
        System.out.println("Inside  Three");
    }

    Three (String msg) {
        System.out.println("Three : " + msg);
    }
}