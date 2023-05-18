package Animals;

interface Animal {
    //by default property of interface is public
    void hasTail();
    void canBark();
    void canSwim();
}

class Dog implements Animal {
    @Override
    public void hasTail() {
        System.out.println("it has a tail");
    }

    @Override
    public void canBark() {
        System.out.println("it can bark");
    }

    @Override
    public void canSwim() {
        System.out.println("hardly swims");
    }
}

class Crocodile implements Animal {
    @Override
    public void hasTail() {
        System.out.println("it has a tail");
    }

    @Override
    public void canBark() {
        System.out.println("it can not bark");
    }

    @Override
    public void canSwim() {
        System.out.println("swims like a boss !!");
    }
}

class Crow implements Animal {
    @Override
    public void hasTail() {
        System.out.println("it has a tail");
    }

    @Override
    public void canBark() {
        System.out.println("it cannot bark");
    }

    @Override
    public void canSwim() {
        System.out.println("it cannot swim");
    }
}