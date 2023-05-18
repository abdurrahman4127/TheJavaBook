package Random;

public class Horse implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Chihihihi");
    }

    @Override
    public void run() {
        System.out.println("Run Horse Run!!!!");
    }

    //self method
    public void sleeping() {
        System.out.println("Sleeping!");
    }
}
