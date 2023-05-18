package PlayerCompetition;

// implementing Runnable interface
class Player implements Runnable
{
    Thread t; // t - reference

    //constructor
    Player(String name) {
        t = new Thread(this); //instantiating Thread and giving a Runnable "target" as parameter
        t.setName(name);
        t.start();
    }

    //overriding method of Runnable interface
    @Override
    public void run() {
        System.out.println(t.getName() + " has started the race");

        for (int i=0; i<3; i++)
        {
            System.out.println(t.getName() + " crossed " + i + " obstacle");
            System.out.println(t.getName() + " finishes the race.");
        }
    }
}

public class Competition{
    public static void main(String[] args)
    {
        Player player1 = new Player("A");
        Player player2 = new Player("B");
        Player player3 = new Player("C");
    }
}