public class TASK1 {

    private static volatile boolean isRunning = true;
    private static int counter = 0;

    public static synchronized void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            while (isRunning) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            while (isRunning) {
                increment();
            }
        });

        t1.start();
        t2.start();

        Thread.sleep(1000); 
        isRunning = false;  

        t1.join();
        t2.join();

        System.out.println("Counter: " + counter);
    }
}
