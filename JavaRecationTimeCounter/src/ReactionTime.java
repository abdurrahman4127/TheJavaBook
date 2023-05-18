import java.util.Scanner;

public class ReactionTime {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        for(int i=3; i>0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("start typing ...");

        // timer counting starts from this line
        // long startTime = System.currentTimeMillis();  // legends say nano is more accurate than milli  here.
        long startTime = System.nanoTime();

        // user input
        scanner.next();

        // time counting stops right after hitting enter
        // long endTime = System.currentTimeMillis();  
        long endTime = System.nanoTime();

        long timeDifference = endTime - startTime;
        System.out.println("reaction time : " + timeDifference + " nano-seconds");
    }
}
