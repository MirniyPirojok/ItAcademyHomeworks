package homework11.callCenterSynch;

import static java.lang.Thread.sleep;

public class CallCenter {
    public static final int OPERATOR_COUNT = 3;
    public static final int CLIENT_COUNT = 15;

    public static Operator[] operators = new Operator[OPERATOR_COUNT];


    public static void main(String[] args) {
        System.out.println("Call center started to work.");

        //make array of operators
        for (int i = 0; i < OPERATOR_COUNT; i++) {
            operators[i] = new Operator(i + 1);
        }

        for (int i = 1; i <= CLIENT_COUNT; i++) {
            //make client thread
            Client client = new Client(i);
            Thread t = new Thread(client);

            //choose free operator
            for (int j = OPERATOR_COUNT - 1; j >= 0; j--) {
                if (!operators[j].isOnCall()) {
                    client.setOperator(operators[j]);
                }
            }

            t.start();//start speaking

            //pause between new clients
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }//end of main
}//end of class
