import java.util.PriorityQueue;

public class BillPayment {
 public static void main(String[] args)
 {
     PriorityQueue<String> list = new PriorityQueue<String>();

     // adding people
     list.add("man 1");
     list.add("man 2");
     list.add("man 3");
     list.add("man 4");
     list.add("man 5");

     System.out.println("before poling : " + list);

     // peeking
     System.out.println("First one in he line : " + list.peek() + "\n");

     // polling
     System.out.println(list.poll() + " is the first one to pay the bill");

     System.out.println("\n after poling : " + list);
    }
}