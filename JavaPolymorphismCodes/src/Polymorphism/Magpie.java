package Polymorphism;

class Magpie extends Birds {
    Magpie() {
        System.out.println("A magpie is created");
    }

    void fly() {
        System.out.println("Magpie is flying..");
    }

    void fly(int speed) {
        System.out.println("Magpie is flying at speed " + speed);
    }

    void eat() {
        System.out.println("Magpie is eating");
    }
}