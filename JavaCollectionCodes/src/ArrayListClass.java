import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args)
    {
        //declare collection
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("size of list : " + list.size());
        System.out.println(list);

        list.add(2,25);  //adding at index 2
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}
