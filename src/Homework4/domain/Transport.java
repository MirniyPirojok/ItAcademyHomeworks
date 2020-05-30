package Homework4.domain;

public class Transport extends Technology implements TransportTrading {
    protected int weight = 1;
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
    public void upgrade(int i) {
        weight += i;
    }

    @Override
    public void downgrade(int i) {
        if (i >= weight) {
            System.out.println("\nDowngraded too much. Negative or zero weight is unacceptable.");
        }
        else weight -= i;
    }


    @Override
    public void raisePrice(int i) {
        price += i;
    }

    @Override
    public void reducePrice(int i) {
        price -= i;
    }
}//end of class
