package homework4_5.domain;

import java.util.Objects;

public class Car extends Transport {
    private final static String CAR_OWNER = "Yaroslav";

    private CarType type;
    private int maxSpeed;
    private int id;

    public Car() {
    }

    public Car(int id) {
        this.id = id;
    }

    public Car(int weight, int price, int maxSpeed, CarType type) {
        super(weight, price);
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

    public static String getCarOwner() {
        return CAR_OWNER;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
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
        return "Car #" + id + ". " +
                "CarOwner: " + CAR_OWNER +
                ", type:" + type +
                "(" + type.getTypeDescription() + ")" +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", price=" + price +
                ", year=" + YEAR;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                weight == car.weight &&
                price == car.price &&
                YEAR == car.YEAR &&
                Objects.equals(type, car.type) &&
                Objects.equals(CAR_OWNER, car.CAR_OWNER);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, maxSpeed, weight, price, CAR_OWNER, YEAR);
    }

}//end of class


