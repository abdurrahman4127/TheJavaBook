package AbstractAndNonAbstractPackaging.geomerty;

public class Rectangle extends Shape {
    public Rectangle(double d1, double d2) {
        dimension1 = d1;
        dimension1 = d2;
    }

    public void printArea() {
        System.out.println("Area of rectangle is : " + dimension1 * dimension2);
    }
}
