package AbstractAndNonAbstractPackaging.coordinate;

//inheritance...
public class Point3D extends Point {
    double z;

//    public static int n = 0; // we don't need to add static int n = 0; here because it's already in the Point Class

    //add all the required parameters (not just double z)
    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    //this overrides the print methode.
    public void print() {
        System.out.println(n + " no. point : (" + x + " , " + y + " , " + z + ")");
    }
}
