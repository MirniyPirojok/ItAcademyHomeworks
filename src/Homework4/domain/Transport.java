package Homework4.domain;

public class Transport extends Technology {
    protected int weight;

    public Transport() {
    }

    public Transport(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int upgrade(int i) {
        return weight+=i;
    }

    @Override
    public int downgrade(int i) {
        return weight+=i;
    }
}//end of class
