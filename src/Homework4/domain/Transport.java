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
        this.weight += i;
    }

    @Override
    public void downgrade(int i) {
        if (i >= this.weight) {
            System.out.println("\nTransport downgraded too much. Negative or zero weight is unacceptable.");
        }
        else this.weight -= i;
    }


    @Override
    public void raisePrice(int i) {
        this.price += i;
        System.out.println(" price was upgraded to " + this.getPrice());
    }

    @Override
    public void reducePrice(int i) {
        this.price -= i;
        System.out.println(" price was reduced to " + this.getPrice());
    }
}//end of class
