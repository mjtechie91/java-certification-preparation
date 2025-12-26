package threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main start");
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("Main end");
    }
}
