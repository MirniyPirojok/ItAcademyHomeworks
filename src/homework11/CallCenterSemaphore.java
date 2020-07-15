package homework11;

import java.util.concurrent.Semaphore;

public class CallCenterSemaphore {
    private static final int OPERATORS_COUNT = 2;

    private static final int CUSTOMERS_COUNT = 7;

    private static final boolean[] OPERATORS = new boolean[OPERATORS_COUNT];//call center capacity

    private static final Semaphore SEMAPHORE = new Semaphore(OPERATORS_COUNT, true);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= CUSTOMERS_COUNT; i++) {
            new Thread(new Customer(i)).start();
            Thread.sleep(400);
        }
    }//end of main

    public static class Customer implements Runnable {
        private final int customerId;

        public Customer(int customerId) {
            this.customerId = customerId;
        }

        @Override
        public void run() {
            System.out.printf("Customer #%d called to call center.\n", customerId);
            try {
                SEMAPHORE.acquire();

                int operatorId = -1;
                for (int i = 0; i < OPERATORS_COUNT; i++)
                    if (!OPERATORS[i]) {
                        OPERATORS[i] = true;
                        operatorId = i;
                        System.out.printf("Operator #%d started to service customer #%d.\n", i + 1, customerId);
                        break;
                    }

                Thread.sleep(5000);

                OPERATORS[operatorId] = false;

                SEMAPHORE.release();
                System.out.printf("Customer #%d was serviced.\n", customerId);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван");
            }
        }
    }
}//end of class
