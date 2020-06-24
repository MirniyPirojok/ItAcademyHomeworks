package homework3.domain;

public class Car {
    private static final String CAR_OWNER = "Yaroslav";

    private int weight;
    private String type;

    public Car() {
    }

    public Car(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public static String getCarOwner() {
        return CAR_OWNER;
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
                "owner: " + CAR_OWNER +
                "; weight: " + weight + " ton" +
                "; type: " + type +
                '}';
    }
}
