package Homework4.domain;

public class Transport extends Technology implements TransportTrading {
    protected int weight;
    protected int price = 1000;

    public Transport() {
    }

    public Transport(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int upgrade(int i) {
        return weight += i;
    }

    @Override
    public int downgrade(int i) {
        return weight += i;
    }

    @Override
    public int raisePrice(int i) {
        return price += i;
    }

    @Override
    public int reducePrice(int i) {
        return price -= i;
    }
}//end of class
