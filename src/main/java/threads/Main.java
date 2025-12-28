package threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main start");
        MyThread thread = new MyThread();
        thread.run();
        thread.start();


        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        System.out.println("Main end");
    }
}
