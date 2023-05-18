package AbstractAndNonAbstractPackaging.coordinate;

public class Point {
    public double x,y; //add 'public' so that it can be accessed from elsewhere

    // to keep a count on number of created objects…
    public static int n = 0; // n has to be public static; else it won't be accessible

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        n++; //counts how many times the construct has been called
    }

     //add 'public' keyword; else it won't be accessible (package-privacy)
     public void print() {
         System.out.println(n + " no. point : (" + x + " , " + y + ")");
     }
}
