package SubClassPolymorphism;

//subclass polymorphism
class Shape {
    void draw(){
        System.out.println("Drawing a random shape");
    }
}

class Triangle extends Shape {
    void draw(){
        System.out.println("Drawing a triangle");
    }
}

class Rectangle extends Shape {
    void draw(){
        System.out.println("Drawing a triangle");
    }
}

class Circle extends Shape {
    void draw(){
        System.out.println("Drawing a circle");
    }
}

class Isosceles extends Triangle {
    void draw(){
        System.out.println("Drawing an Isosceles triangle");
    }
}

class Square extends Rectangle {
    void draw(){
        System.out.println("Drawing an Isosceles triangle");
    }
}


public class SubPolymorphism {
    public static void main(String[] args)
    {
        draw(new Triangle());
        draw(new Rectangle());
        draw(new Isosceles());
    }

    //doing :  Shape shape = new  Triangle(); using methode
    //assigning objects to (static)  Shape Class' reference shape

    static void  draw(Shape shape) { //assigning subclasses' object to super class
        shape.draw();
    }

    //if it was not allowed, we'd have to write draw methode multiple time...
//    static void draw( Triangle triangle){
//        triangle.draw();
//    }
//
//    static void draw( Rectangle rectangle){
//        rectangle.draw();
//    }
//
//    static void draw( Isosceles rectangle){
//        rectangle .draw();
//    }
}
