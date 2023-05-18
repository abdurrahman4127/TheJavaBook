//abstract...
// if we don't know the definition og the methode, we call it abstract Class

package AbstractAndNonAbstractPackaging.geomerty;

// abstract class can't have any object
public abstract class Shape {
    double dimension1 = 3;
    double dimension2 = 9;

    // to make an abstract methode, we need to make the class abstract-type
    abstract public void printArea();
}
