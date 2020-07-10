package homework11.callCenterSynch;

import static java.lang.Thread.sleep;

public class CallCenterDemo {

    public static final int OPERATORS_COUNT = 3;
    public static final int CLIENT_COUNT = 10;

    public static void main(String[] args) {
        CallCenter callCenter = new CallCenter(OPERATORS_COUNT);

        for (int i = 1; i <= CLIENT_COUNT; i++) {
            Thread t = new Thread(new Client(i, callCenter));
            t.start();
            try {
                sleep(1000); //time between clients calling
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }//end of main
}//end of class
