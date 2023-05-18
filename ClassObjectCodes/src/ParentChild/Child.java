package ParentChild;

class Child extends Parents
{
    //    super();  // will call the constructor of the parents class
    String name;

    public Child(String p, String c) {
//        super.name = p;
//        super.printName(); //nazmul
        super(p); //this will call parents' constructors
        name = c;
    }

    void printName() {
        System.out.println(super.name + " " + name); //nazmul; Abdur rahman
    }
}