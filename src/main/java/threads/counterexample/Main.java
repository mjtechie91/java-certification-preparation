package threads.counterexample;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main started");

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++ ){
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++ ){
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try{

            thread1.join();
            thread2.join();

        } catch (InterruptedException e){
            System.out.println("InterruptedException occurred");
        }
        System.out.println(counter.getCount());

        System.out.println("Main End");
    }
}
