import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students {
    String name;
    int iD;
    double cgpa;

    public Students(String name, int iD, double cgpa) {
        this.name = name;
        this.iD = iD;
        this.cgpa = cgpa;
    }
}

public class ObjSorting {
    public static void main(String[] args)
    {
        try {
            ArrayList<Students> list = new ArrayList<>();

            list.add(new Students("A", 7,3.77));   // creating object (without reference)
            list.add(new Students("B", 8,3.77));
            list.add(new Students("C", 4,3.5));
            list.add(new Students("D", 1,3.88));

            System.out.println("---Before sorting ---");
            printStudentData(list);

            System.out.println("---After  sorting ---");

            Collections.sort(list, new Comparator<Students>() { //anonymous
                @Override
                public int compare(Students left, Students right) {
                    if(right.cgpa > left.cgpa)
                        return -1;   // -1 : goes to the left
                    if(left.cgpa > right.cgpa)
                        return 1;    // goes to the right

                    return left.name.compareTo(right.name);  //small UP ; big DOWN
                }
            });

            printStudentData(list);  //method is to be a static as it's inside main method
        }

        catch(Exception e) {
            e.printStackTrace();
        }

    }

    static void printStudentData(ArrayList<Students> list) {
        //for-each is smarter
        for (Students s : list) {
            System.out.println(s.name + " " + s.iD + " " + s.cgpa);
        }
    }
}