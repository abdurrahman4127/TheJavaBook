package AbstractAndNonAbstractPackaging;

/*package...
            import package.name.Class; imports a single class
            import package.name.*; imports the whole class

            importing Point class from coordinate package
            import coordinate.Point;
            import coordinate.Point3D;
 */

//importing whole class
import AbstractAndNonAbstractPackaging.coordinate.*;
import AbstractAndNonAbstractPackaging.geomerty.*;

public class Driver {
    public static void main(String[] args)
    {
        Point p1 = new Point(10,20);
        p1.x = 10;
        p1.print();

        Point p2 = new Point3D(10,40,32);
        p2.print();

        // creating an obj. to check n
        new Point(1,2);

/*
         no reference made; nevertheless n will increase, since constructor has been called
         it can be accessed by p1.n, p2.n, Point.n and Point3D.n
         'n' is a property of Class Point, and Class Point3D extends to Class Point, that's why it's accessible
 */

        System.out.println("accessing by p1.n : " + p1.n);
        System.out.println("accessing by p2.n : " + p2.n);
        System.out.println("accessing by Point.n : " + Point.n);
        System.out.println("accessing by Point3D.n : " + Point3D.n);

        System.out.println();

/*               from geometry package...
         Shape s1 = new Shape(); isn't possible because we can't have object inside
         obstruct class, but we can have the object of Rectangle
 */

        //these two are the same...
        Shape s1 = new Rectangle(10,20); //assigning Rectangle object s1 to the reference of Abstract class; it's possible
        s1.printArea();

        Rectangle r1 = new Rectangle(10,20); //directly assigning r1 object to non-abstract reference
        r1.printArea();
    }
}
