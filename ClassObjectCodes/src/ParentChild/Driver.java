package ParentChild;

public class Driver {
    public static void main(String[] args)
    {
        Parents p = new Parents("Nazmul");
        p.printName();

        Child c = new  Child("Nazmul","Abdur Rahman");
        c.printName();

        Three three1 = new  Three();
        System.out.println(); //inside one, two, three
        Three three2 = new Three("University"); //inside one, inside two, inside three university

 /*
        java calls super(parameterless); function by default.
        it doesn't create parameter including super(); function by itself
        therefore, it won't pass super(msg) to anyone, other than from the
        class it was written from ( Three)
 */

        objectClassConcept obj = new objectClassConcept();
        obj.name = "objectName";
        System.out.println(obj); //this will print "objectName"

        //if toString() wasn't overridden, it would print the address of the class
        //to try, remove toString methode; it will print :  objectClassConcept@1540e19d
    }
}
