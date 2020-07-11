package homework11.callCenterSynch;

import static java.lang.Thread.sleep;

public class Operator {
    public static final int SERVICING_TIME = 4000;

    private final int operatorId;

    private boolean onCall;

    public Operator(int operatorId) {
        this.onCall = false;
        this.operatorId = operatorId;
        System.out.println("Operator #" + operatorId + " started to work.");
    }

    public boolean isOnCall() {
        return this.onCall;
    }

    public void setOnCall(boolean onCall) {
        this.onCall = onCall;
    }

    synchronized public void service(int clientId) {
        this.setOnCall(true);

        System.out.println("Operator #" + this.operatorId + " started to service client #" + clientId);
        //wait while operator speak with client
        try {
            sleep(SERVICING_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Operator #" + this.operatorId + " finished to service client #" + clientId);

        this.setOnCall(false);
    }

}//end of class
