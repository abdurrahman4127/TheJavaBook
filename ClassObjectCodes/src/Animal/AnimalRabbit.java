package Animal;

class Animal {
    String name;
    int age;
    boolean hasTail;

    public void eat() {
        System.out.println(name + " is eating");
    }

    public  void bark() {
        System.out.println(name + " is barking");
    }

    void printMyDetails() {
        System.out.println("name : " + name + "age : " + age);
    }
}

class Bird extends Animal {
    public void fly() {
        System.out.println(name + " is flying");
    }
}


public class AnimalRabbit {
    public static void main(String[] args)
    {
        Animal rabbit = new Animal();
        rabbit.name = "Rocket";
        rabbit.eat();
    }
}
