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

    public void setWasServiced(boolean wasServiced) {
        this.wasServiced = wasServiced;
    }

    @Override
    public void run() {
        System.out.println("Client #" + this.clientId + " is calling...");

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Operator operator : callCenter.operators) {
            if (!operator.isOnCall()) {
                operator.service(clientId);
                this.setWasServiced(true);
                break;
            }
        }
        semaphore.release();
    }
}//end of class
