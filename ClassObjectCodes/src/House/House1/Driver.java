package House.House1;

public class Driver {
    public static void main(String[] args)
    {
        House palace = new House();

        palace.name = "Taj Mahal";
        palace.doors = 10;
        palace.location = "Agra";

        palace.namePlate();

        House hotel = new House();
        hotel.name = "Radisson";
        hotel.doors = 15;
        hotel.floor = 3;
        hotel.location = "Shajek";
        hotel.namePlate();

//        System.out.println(palace.location);
//        System.out.println(hotel.location);

//        System.out.println(palace.floor);  // 0
//        System.out.println(hotel.floor);  // 3

        House hostel = new House();
        System.out.println(hostel.doors);
        System.out.println(hostel.windows);

        House building = new House("Villa", 2);
        System.out.println(building.name);
        System.out.println(building.floor);
    }
}
