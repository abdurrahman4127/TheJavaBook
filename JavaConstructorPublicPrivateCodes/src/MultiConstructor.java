//constructor

class Box {
    double length;
    double width;
    double height;

    //for Box-one
    public Box(double length, double width, double height) {
        //changeLength(length); can be used instead of 'this.length = length;'
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //for Box-two...
    public Box(double dimension) {
        this.length = dimension; 
        this.width = dimension;  // 'dimension' and the properties of class ain't conflicting
        this.height = dimension;
    }

    //for Box-three... just changing length (using methode)
    void changeLength(double length) {
        if(length < 0)
            this.length = 0; //if it's negative, it'll be 0
        else
            this.length = length;
    }

    // don't do : double getVolume(double length, double width, double height)
    double getVolume(){
        double vol = length * width * height;
        return (vol);
    }
}


public class MultiConstructor {
    public static void main(String[] args)
    {
        //passing all values
        Box one = new Box(12,34,21);
        System.out.println("volume of box-one : " + one.getVolume());

        //passing one values for all
        Box two = new Box(10);
        System.out.println("volume of box-two : " + two.getVolume());

        //using methode...
        Box three = new Box(10,20,30);
        three.changeLength(-92); // negative values will make the volume 0
        System.out.println("volume of box-three : " + three.getVolume());
    }
}
