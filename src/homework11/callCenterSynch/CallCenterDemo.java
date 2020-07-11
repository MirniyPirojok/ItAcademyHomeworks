package homework11.callCenterSynch;

import static java.lang.Thread.sleep;

public class CallCenterDemo {

    public static final int OPERATORS_COUNT = 2;
    public static final int CLIENT_COUNT = 10;
    public static final int TIME_BETWEEN_CLIENTS_CALLING = 1500;

    public static void main(String[] args) throws InterruptedException {
        CallCenter callCenter = new CallCenter(OPERATORS_COUNT);

        for (int i = 1; i <= CLIENT_COUNT; i++) {
            Thread t = new Thread(new Client(i, callCenter));
            t.start();
            sleep(TIME_BETWEEN_CLIENTS_CALLING);
        }
    }//end of main
}//end of class
