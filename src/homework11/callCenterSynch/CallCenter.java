package homework11.callCenterSynch;

public class CallCenter {
    Operator[] operators;
    private final int operatorsCount;

    public CallCenter(int operatorsCount) {
        this.operatorsCount = operatorsCount;
        System.out.println("Call center started to work.");
        addOperators();
    }

    public void addOperators() {
        operators = new Operator[this.operatorsCount];
        for (int i = 0; i < this.operatorsCount; i++) {
            operators[i] = new Operator(i + 1);
        }
    }

}//end of class
