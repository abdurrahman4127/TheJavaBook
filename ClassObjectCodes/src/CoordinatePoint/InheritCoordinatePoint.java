package CoordinatePoint;

//base class, super-class, parents class
class Point {
    double x,y;

    //constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("(" + x + " , " + y + ")");
    }
}

//derived class, child class, sub-class
class Point3D extends Point { //extended version of class CoordinatePoint.Point
    double z;

    //creating another constructor for sub-class
    public Point3D(double x, double y, double z) {
        //calling the constructor in super-class
        super(x,y);
        this.z = z;
        //"super(x,y);" can't written after "this.z = z;"
    }

    //(Class CoordinatePoint.Point's) methode overriding (extending for p2)
    void printPoint() {
        System.out.println("(" + x + " , " + y + " , " + z + ")"); //add the change
    }
}

public class InheritCoordinatePoint {
    public static void main(String[] args)
    {
        Point p1 = new Point(10,20); //constructor is made for it
        p1.x = 5;
        p1.printPoint();

        Point p2 = new Point3D(50,60,70); //don't need to call another (CoordinatePoint.Point3D) class.
        p2.printPoint();

   /*     this will work as well.
        CoordinatePoint.Point3D p2 = new CoordinatePoint.Point3D(50,60,70);
        p2.printPoint();
   */
    }
}
