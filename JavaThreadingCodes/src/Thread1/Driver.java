package Thread1;

public class Driver {
    public static void main(String[] args)
    {
        // Thread1 inheritance
        ThreadInherit thread1 = new ThreadInherit();
        ThreadInherit thread2 = new ThreadInherit();
        ThreadInherit thread3 = new ThreadInherit();

        /*
        thread1.start();
        thread2.start();
        thread3.start();
         */

        // thread interface
        Thread tInterface1 = new Thread(new ThreadInterface());
        Thread tInterface2 = new Thread(new ThreadInterface());
        Thread tInterface3 = new Thread(new ThreadInterface());

        tInterface1.start();
        tInterface2.start();
        tInterface3.start();
    }
}
