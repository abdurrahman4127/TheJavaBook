package Thread1;

public class ThreadInherit extends Thread {

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getId() + " values : " + i);

            try {
                Thread.sleep(10);  // need to use exception
            }

            catch (InterruptedException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
