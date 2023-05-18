package House.House3;

import java.util.Scanner;

class House {
    int walls, windows, doors;
    String name, location, namePlate;

    //constructors are, by default, public
    House(String  location, String namePlate) {
        walls = 4;
        doors = 1;
        windows = 2;
        this.location = location;  // this refers current object that's tryna access the class
        this.namePlate = namePlate;

    }

    void printDetails() {
        System.out.println("name plate : " + namePlate);
        System.out.println("location : " + location);
    }
}

/*
 polymorphism : function with same names & return type but different signature
 such as : numbers, types, sequence of parameter
 function return types are not considered to be the signature
 */

public class HouseClass {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter location : ");
        String resortLocation = scanner.nextLine();

        System.out.println("enter name plate :");
        String resortNamePlate = scanner.nextLine();

        House resort = new House(resortLocation, resortNamePlate);
        resort.printDetails();
    }
}
