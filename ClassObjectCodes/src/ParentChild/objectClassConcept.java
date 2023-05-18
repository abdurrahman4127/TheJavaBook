package ParentChild;

class objectClassConcept {
    /*
        all the classes are inherited from Object class (by default)
        inside that class, there are many methods (built-in), such as toString(), hashCode(), isEqual()
         toString() is used to print the address of the Class, but we can override it.
    */
    String name;

    public String toString() {
        return name;
    }
}