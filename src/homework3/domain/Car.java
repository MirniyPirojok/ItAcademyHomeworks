package homework3.domain;

import practiceannotaiton.PracticeAnnotation;

@PracticeAnnotation public class Car {
    private static final String CAR_OWNER = "Yaroslav";

    @PracticeAnnotation
    private int weight;

    @PracticeAnnotation
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

    @PracticeAnnotation
    public int getWeight() {
        return weight;
    }

    @PracticeAnnotation
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @PracticeAnnotation
    public String getType() {
        return type;
    }

    @PracticeAnnotation
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
