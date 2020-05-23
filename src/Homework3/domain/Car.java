

package Homework3.domain;

public class Car {
    private static final String carOwner = "Yaroslav";
    private int weight;
    private String type;

    public Car() {
    }

    public Car(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public static String getCarOwner() {
        return carOwner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Car {" +
                "owner: " + carOwner +
                "; weight: " + weight + " ton" +
                "; type: " + type +
                '}';
    }
}
