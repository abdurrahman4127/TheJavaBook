package AbstructionSubClass;

public abstract class Abstraction
{
    abstract void  a_method();

    public Abstraction() {
        System.out.println("This is constructor of abstract class.");
    }

    public void nonAbstract() {
        System.out.println("This is normal method of abstract class.");
    }
}

class SubClass extends Abstraction {
    @Override
    void a_method() {
        System.out.println("This is abstract method.");
    }
}