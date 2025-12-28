package threads.volatileexample;

public class VolatileExample implements Runnable{
    volatile boolean running = true;

    public void stopRunning(){
        running = false;
    }

    @Override
    public void run() {
        while(running){
            System.out.println("Thread is running");
        }
        System.out.println("Stopped");
    }
}
