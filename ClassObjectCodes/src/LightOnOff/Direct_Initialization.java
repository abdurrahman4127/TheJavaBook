package LightOnOff;

class Light {
    String lightName;
    boolean isOn = true; //by default, boolean is false, but we're doing 'direct assignment'

    //methods ...
    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    //this is to print the output
    void checkStatues() {
        System.out.println(lightName + " is on : " + isOn);
    }
}

public class Direct_Initialization {
    public static void main(String[] args)
    {
        Light a = new Light();
        Light b = new Light();
        a.lightName = "1st light";
        b.lightName = "2nd light";

        a.turnOn();
        b.turnOff();

        a.checkStatues();
        b.checkStatues();
    }
}


/*      values by default :
     int, short, byte, long, char = 0
     float, double = 0.0
     String, array = null
     boolean = false
 */
