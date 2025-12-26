package threads.test;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) throws InterruptedException {
        int x  = 10;
        System.out.println(Arrays.toString(Thread.currentThread().getStackTrace()));
        String str = "Hello Thread World!!";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            Thread.sleep(500L);
        }
    }
}
