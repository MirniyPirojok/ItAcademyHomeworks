package homework11.callCenterSynch;

public class Operator {
    int operatorId;
    private boolean onCall = false;

    public Operator() {
        System.out.println("Operator started to work.");
    }

    public Operator(int operatorId) {
        System.out.println("Operator #" + operatorId + " started to work.");
        this.operatorId = operatorId;
    }

    public boolean isOnCall() {
        return onCall;
    }

    public void setOnCall(boolean onCall) {
        this.onCall = onCall;
    }

    synchronized public void service(int clientId) {
        onCall = true;
        System.out.println("Operator #" + this.operatorId + " started to service client #" + clientId);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Operator #" + this.operatorId + " finished to service client #" + clientId);
        onCall = false;
    }
}//end of class
