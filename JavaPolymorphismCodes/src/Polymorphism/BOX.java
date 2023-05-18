package Polymorphism;

//static methode can't be overridden
class BOX {
    double width;
    double height;
    double depth;

    //constructor when al dimensions are mentioned
    BOX(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    //constructor when cube is created
    BOX(double len) {
        this(len,len,len); //calling constructor from the same class (just like 'super')
        //width = height = depth = len; // is also correct
    }

    double getVolume() {
        return (width*height*depth);
    }
}