package Homework4.domain;

import java.util.Objects;

public class Car extends Transport {
    private final static String carOwner = "Yaroslav";
    private String type;
    private int maxSpeed;
    private int id;

    public Car() {
    }
    public Car(int id) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void upgrade(int i) {
        this.maxSpeed += i;
        System.out.println("\nCar #" + this.id + " speed was upgraded to " + this.getMaxSpeed());
    }

    @Override
    public void downgrade(int i) {
        this.maxSpeed -= i;
        System.out.println("\nCar #" + this.id + " speed was downgraded to " + this.getMaxSpeed());
    }

    @Override
    public String toString() {
        return "Car #" + id + ": " +
                "carOwner='" + carOwner + '\'' +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", price=" + price +
                ", year=" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                weight == car.weight &&
                price == car.price &&
                year == car.year &&
                Objects.equals(type, car.type) &&
                Objects.equals(carOwner, car.carOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, maxSpeed, weight, price, carOwner, year);
    }

}//end of class


