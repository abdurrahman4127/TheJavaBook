//constructor
class Series {
    int start;
    int end;

    //same as class' name (special function )
    // 'public' is obligatory so that it can be accessible
    //constructor for s1
    public Series(int start, int end) {
        this.start = start;
        this.end = end;
    }

    //constructor for s2
    public Series(int start) {   //variable name is : start
        this.start = start;       //to specify, we added 'this.' because both variable and class property variable are same
    }


    //constructor for s3
    public Series() {
   /*
         goes in background as default
         where start = 0; and n = 0; (by default)
         java creates it itself, if we get nothing to pass
   */
    }

    int getSqSum() {
        int sum = 0;

        for(int i = start; i<=end; i++) {
            sum += i;
        }
        return sum;
    }
}

public class ConstructorSeries {
    public static void main(String []args)
    {
        //giving both values inside it.
        Series s1 = new Series(1,10);
        System.out.println("s1 : " + s1.getSqSum());

        //giving one value inside it.
        Series s2 = new Series(10);
        s2.end = 20;
        System.out.println("s2 : " + s2.getSqSum());

        //giving no value inside it.
        Series s3 = new Series();
        s3.start = 30;
        s3.end = 50;
        System.out.println("s3 : " + s3.getSqSum());
    }
}
