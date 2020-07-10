package homework11.callCenterSynch;

public class Client implements Runnable {

    int clientId;
    Operator operator;

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Client(int clientId) {
        this.clientId = clientId;
        System.out.println("Client #" + clientId + " is calling...");
    }

    @Override
    public void run() {
        speak();
    }

    synchronized public void speak() {
        try {
            operator.service(this.clientId);
        } catch (NullPointerException e){
            System.out.println("Sorry, there is no free operators. Call later.");
        }
    }

}//end of class
