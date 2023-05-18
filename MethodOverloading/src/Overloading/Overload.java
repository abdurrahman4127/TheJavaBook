package Overloading;/*        methode signature depends on
   1.methode name
   2.parameter number
   3.parameter types
   4.parameter order (return type doesn't matter)
          return type doesn't matter
*/

/*        methode overloading :
       same class, same name; but different signature
       parameter type different
 */

class MethodeSignature
{
    void methode(String a) {
        System.out.println("//");
    }

/*
    // can't have same signature methode under same class;
    void show(String a) {
        System.out.println("//");
    }
*/


    void methode(int a) {
        System.out.println("//");
    }

    void print(int a) {
        System.out.println("int : " + a);
    }

    void print(double a) {
        System.out.println("double : " + a);
    }

    //float won't be called if double has the same signature
    void print(float a) {
        System.out.println("double : " + a);
    }
}

public class Overload {
    public static void main(String[] args)
    {
        MethodeSignature a = new MethodeSignature();

        a.print(10);
        a.print(10.0);
        a.print(10.0);
    }
}
