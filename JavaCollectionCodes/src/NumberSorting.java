import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NumberSorting {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(8);
        System.out.println("size : " + list.size());

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer left, Integer right)
            {
                if(left > right)
                    return -1;  //[8, 5, 3, 1, 1]
                return 0;
            }
        });

        printTheList(list);
    }

    static void printTheList(ArrayList<Integer> list) {
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

//        System.out.println(list);
    }
}
