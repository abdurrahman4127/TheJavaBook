import java.util.PriorityQueue;

public class QueueExample {
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(30);
        pq.add(25);
        pq.add(15);
        pq.add(35);

        System.out.println(pq);

        System.out.println("First Element " + pq.peek());
        System.out.println("Polling  " + pq.poll());
        System.out.println(pq);

        System.out.println(pq.contains(10));
    }
}
