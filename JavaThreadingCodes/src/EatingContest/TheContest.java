package EatingContest;

// implementing the interface
class Player implements Runnable {
    Thread eater; // t - reference

    //constructor
    Player(String name) {
       eater = new Thread(this);
       eater.setName(name);
       eater.start();
    }

    //overriding method of Runnable interface
    @Override
    public void run() {
        System.out.println(eater.getName() + " has started eating");

        for (int i=0; i<3; i++) {
            System.out.println(eater.getName() + " has finished " + i + " burgers");
            System.out.println(eater.getName() + "  has finished eating");
        }
    }
}

public class TheContest {
    public static void main(String[] args)
    {
       Player x = new Player("Abdur Rahman");
       Player y = new Player("Nobody");
    }
}