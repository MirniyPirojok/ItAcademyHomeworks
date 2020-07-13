package homework11.callCenterSemaphore2;

import java.util.concurrent.Semaphore;

public class Client implements Runnable {
    private final int clientId;

    boolean wasServiced;

    CallCenter callCenter;

    Semaphore semaphore;

    public Client(int clientId, CallCenter callCenter, Semaphore semaphore) {
        this.wasServiced = false;
        this.clientId = clientId;
        this.callCenter = callCenter;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println("Client #" + this.clientId + " is calling...");

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //looking for free operator and put client to him
        for (Operator operator : callCenter.operators) {
            if (!operator.isOnCall()) {
                operator.service(clientId);
                break;
            }
        }
        semaphore.release();
    }
}//end of class
