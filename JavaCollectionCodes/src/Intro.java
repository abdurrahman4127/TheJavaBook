//import java.util.ArrayList;

import java.util.ArrayList;

public class Intro {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();

        //adding items to ArrayList
        list.add("String 0");
        list.add("String 1");
        list.add("String 2");
        list.add("String 3");

//        String s1 = list.get(1);
//        System.out.println(list.get(0));
//        System.out.println(s1);

        //to remove :
        list.remove(2); // now it's : 0, 1, 3 (not 2); at 2nd index, it's "String 3; comes one shift right

        //to add
        list.add(1,"been added; not replaced or overridden"); //moving the items to one shift right
        list.add(4,null);  //null can be set as well
        list.add(2,"");  //empty can be set as well

        System.out.println("size is : "+ list.size());

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.clear(); //clears everything
        System.out.println(list.size());

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));  //prints nothing as everything has been cleared
        }

    }

}
