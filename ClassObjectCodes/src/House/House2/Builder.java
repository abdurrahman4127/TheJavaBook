package House.House2;

import java.util.Scanner;

public class Builder {
    public static void main(String[] args)
    {
        //build an apartment of type House
        House apartment = new House();
        apartment.walls = 4;
        apartment.windows = 2;
        apartment.doors = 1;
        apartment.namePlate = "Villa";
        apartment.location = "Mirpur";

        apartment.printNameplate();

        //build a palace of type House
        House palace = new House();
        palace.location = "Gulshan";
        palace.namePlate = "Alishan Bari";
        palace.printNameplate();


        //taking user input from CONSOLE
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter location: ");
        String resortLocation = sc.nextLine();

        System.out.println("Enter Name plate: ");
        String resortNameplate = sc.nextLine();

        System.out.println(" Resort location: " +  resortLocation);
        System.out.println(" Resort Name Plate : " +  resortNameplate);

        // build resort of type House
        House resort = new House(resortLocation, resortNameplate);
        resort.printNameplate();

/*      //Remove the outer comment line to see these actions

        // taking input from GUI
        // JOptionpane always takes input as string
        String userDoor = JOptionPane.showInputDialog("Enter Door Number");// taking userDoor input as String
        // Need to convert to appropriate type before using it
        int houseDoor = Integer.parseInt(userDoor);
        //System.out.println(houseDoor);

        String userWindows = JOptionPane.showInputDialog("Enter Windows Number");// taking userWindows input as String
        // Need to convert to appropriate type before using it
        int houseWindows = Integer.parseInt(userWindows);

        String userWalls = JOptionPane.showInputDialog("Enter Wall Number");// taking userWalls input as String
        // Need to convert to appropriate type before using it
        int houseWalls = Integer.parseInt(userWalls);

        String houseLocation = JOptionPane.showInputDialog("Enter Location Name");// taking houseLocation input as String

        String houseNameplate = JOptionPane.showInputDialog("Enter Name plate");// taking houseNameplate input as String

        // Construct building of House type
        House building = new House(houseWalls, houseDoor, houseWindows, houseLocation, houseNameplate);
        building.printNameplate();

*/
    }
}
