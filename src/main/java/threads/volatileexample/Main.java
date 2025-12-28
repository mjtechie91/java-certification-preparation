package threads.volatileexample;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread");

        VolatileExample volatileExample = new VolatileExample();

        Thread thread = new Thread(volatileExample);

        thread.start();

        Thread.sleep(1000L);

        volatileExample.stopRunning();
        System.out.println("Main Thread stopped");
    }
}
