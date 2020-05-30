package Homework4.domain;

import java.util.Objects;

public class Car extends Transport {
    private final static String carOwner = "Yaroslav";
    private String type;
    private int maxSpeed;

    public Car() {
    }

    public Car(int weight, int price, int maxSpeed, String type) {
        super(weight, price);
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
        if (i > maxSpeed) return maxSpeed = 0;
        return maxSpeed -= i;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carOwner='" + carOwner + '\'' +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                weight == car.weight &&
                price == car.price &&
                Objects.equals(type, car.type);

    }

    @Override
    public int hashCode() {
        return Objects.hash(type, maxSpeed, weight, price);
    }
}//end of class

