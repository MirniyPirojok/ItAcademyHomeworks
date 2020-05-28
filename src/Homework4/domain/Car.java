package Homework4.domain;

public class Car extends Transport {
    final static String carOwner = "Yaroslav";
    private String type;
    private int maxSpeed;

    public Car() {
    }

    public Car(int weight, int maxSpeed, String type) {
        super(weight);
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public Car(int weight, String type, int maxSpeed) {
        super(weight);
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public static String getCarOwner() {
        return carOwner;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int upgrade(int i) {
        return maxSpeed += i;
    }

    @Override
    public int downgrade(int i) {
        return maxSpeed -= i;
    }

    @Override
    public String toString() {
        return " {" +
                "carOwner='" + carOwner + '\'' +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", year=" + year +
                '}';
    }
}//end of class


