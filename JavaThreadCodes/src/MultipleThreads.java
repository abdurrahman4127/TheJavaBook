class NewThread implements Runnable {
    public Thread t;
    String name; // name of thread

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        t.start(); // start() calls the run method for Runnable interface
    }

    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }

        System.out.println(name + " exiting.");
    }
}


public class MultipleThreads {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");

        try {
            // wait for other threads to end
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
