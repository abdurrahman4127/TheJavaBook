package NestedExceptionCodes;

class SuperHeroException extends Exception {
    public SuperHeroException() {  //parameterless constructor
        super();
    }

    public SuperHeroException(String message) {   //String parameter constructor
        super(message);
    }

    public SuperHeroException(int energyLevel) {  //integer parameter constructor
        super("Energy level dropped below : " + energyLevel);
    }
}

public class NestedException_Test6 {
    int energyLevel;

    public NestedException_Test6(int a) {
        energyLevel = a;  //energyLevel = 40
    }

    public void testEnergy() throws SuperHeroException {
        if (energyLevel < 50)
        {
            throw new SuperHeroException(50);  //goes to the constructor that accepts integer parameter
        }
    }

    public static void main(String[] args)
    {
        NestedException_Test6 superHero = new NestedException_Test6(40);

        try {
            superHero.testEnergy();
        }

        catch (SuperHeroException a) {
            System.out.println(a.getMessage() + "\n");
            a.printStackTrace();
        }
    }
}
