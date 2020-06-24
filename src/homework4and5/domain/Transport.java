package homework4and5.domain;

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
    public void upgrade(int plusWeight) {
        this.weight += plusWeight;
        System.out.println("Attempt to plus " + plusWeight + " ton. Transport weight was upgraded successful. New weight is " + this.weight + " ton");
    }

    @Override
    public void downgrade(int minusWeight) {
        if (minusWeight >= this.weight) {
            System.out.println("\nAttempt to minus " + minusWeight + " ton. Transport downgraded too much. Negative or zero weight is unacceptable.");
            System.out.println("Transport weight is still " + this.weight + " ton.");
        } else {
            this.weight -= minusWeight;
            System.out.println("Attempt to minus " + minusWeight + " ton. Transport weight was downgraded successful. New weight is " + this.weight + " ton");
        }
    }


    @Override
    public void raisePrice(int plusPrice) {
        this.price += plusPrice;
        System.out.println(" price was raised to " + this.getPrice());
    }

    @Override
    public void reducePrice(int minusPrice) {
        this.price -= minusPrice;
        System.out.println(" price was reduced to " + this.getPrice());
    }

    @Override
    public String toString() {
        return "Transport{" +
                "weight=" + weight +
                ", price=" + price +
                ", year=" + YEAR +
                '}';
    }
}//end of class
