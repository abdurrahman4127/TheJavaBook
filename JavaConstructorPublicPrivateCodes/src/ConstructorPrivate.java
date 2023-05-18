class Boxes {
    // properties
    private double length; //privatizing the properties so that it can't
    private double width;  //be accessed from outside this Class. Though it can be
    private double height; //accessed through another methode (indirectly)


    //methode to access privatized properties... (doing it for Box-one)
    void changeHeight(double height) {
        //height can't be negative,so a condition can be written
        if(height < 0)
            this.height = 0; // by default, it'll be zero
        else
            this.height = height; //if the variable name is different then we don't have to add this word
    }


    //methode to access privatized properties... (doing it for Box-one)
    void changeLength(double length) {
        //height can't be negative,so a condition can be written
        if(length < 0)
            this.length = 0; // by default, it'll be zero
        else
            this.length = length; //if the variable name is different then we don't have to add this word
    }


    //methode to access privatized properties... (doing it for Box-three so that volume doesn't become negative)
    void changeWidth(double width) {
        //width can't be negative,so a condition can be written
        if(width < 0)
            this.width = 0; // by default, it'll be zero
        else
            this.width = width; //if the variable name is different then we don't have to add this word
    }


    //to see variables' value from outside... getter-function
    double getHeight() {
        return height;
    }

    double getWidth() {
        return width;
    }

    double getLength() {
        return getLength();
    }


    // constructor
    public Boxes(double length, double width, double height) {
        this.length = length;
        //this.width = width;
        this.height = height;
        changeWidth(width); // pass width to 'changeWidth()' function ; better if write it for all
    }

    // methode
    double getVolume() {
        double vol = length * width * height;
        return (vol);
    }
}

public class ConstructorPrivate {
    public static void main(String[] args)
    {
        Boxes one, two, three;

        one = new Boxes(12,34,32);
        one.changeHeight(31); //accessing to privet properties inside CLASS and changing its height

        two = new Boxes(30,33,32);
        two.changeLength(35); //accessing to privet properties inside CLASS and changing its length

        System.out.println("Box One : " + one.getVolume());
        System.out.println("Box Two : " + two.getVolume());
        
        // in case, we pass negative values inside object and wish to get zero as output
        three = new Boxes(12,-43,54);
        System.out.println("Box Three : " + three.getVolume());

        // to see any components (lnt, wdt or hgt), we need a getter function (as it's privatized)
        System.out.println("Height of Box-three : " + three.getHeight() );
    }
}
