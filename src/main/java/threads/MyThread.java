package threads;

public class MyThread extends Thread{

    public void run() {
        System.out.println("MyThread is running on a thread name: " + Thread.currentThread().getName());
    }
}
