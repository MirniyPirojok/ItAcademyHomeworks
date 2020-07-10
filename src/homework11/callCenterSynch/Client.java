package homework11.callCenterSynch;

public class Client implements Runnable {
    private final int clientId;

    boolean wasServiced;

    CallCenter callCenter;

    public Client(int clientId, CallCenter callCenter) {
        this.wasServiced = false;
        this.clientId = clientId;
        this.callCenter = callCenter;
    }

    public void setWasServiced(boolean wasServiced) {
        this.wasServiced = wasServiced;
    }

    @Override
    public void run() {
        System.out.println("Client #" + this.clientId + " is calling...");

        //while client is not serviced
        //looking for free operator and service client
        while (!this.wasServiced) {
            for (Operator operator : callCenter.operators) {
                if (!operator.isOnCall()) {
                    operator.service(clientId);
                    this.setWasServiced(true);
                    break;
                }
            }
        }
    }
}//end of class
