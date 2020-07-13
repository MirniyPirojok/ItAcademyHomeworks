package homework11.callCenterSemaphore2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class CallCenterDemo {

    public static final int OPERATORS_COUNT = 3;
    public static final int CLIENT_COUNT = 20;
    public static final int TIME_BETWEEN_CLIENTS_CALLING = 500;
    public static Semaphore semaphore = new Semaphore(OPERATORS_COUNT, true);


    public static void main(String[] args) throws InterruptedException {
        CallCenter callCenter = new CallCenter(OPERATORS_COUNT);
        List<Thread> threads = new ArrayList<>();

        //client calling
        for (int i = 1; i <= CLIENT_COUNT; i++) {
            Thread t = new Thread(new Client(i, callCenter, semaphore));
            t.start();
            threads.add(t);
            sleep(TIME_BETWEEN_CLIENTS_CALLING);
        }

        //wait finishing of all threads
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e){
                System.out.println("Main thread is interrupted.");
            }
        }

        System.out.println("\nCall center finished to work.");
    }//end of main
}//end of class
