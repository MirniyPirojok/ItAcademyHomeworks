package Homework4.domain;

public enum CarType {
    SEDAN("Sedan"), JEEP("Jeep"), TRUCK("Truck");

    private String typeDescription;

    CarType(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public static void printAllValues(){
        for (CarType value: CarType.values()) {
            System.out.println(value + ": " + value.getTypeDescription());
        }
    }
}//end of class
