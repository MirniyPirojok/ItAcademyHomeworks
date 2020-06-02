package OOP.domain;

public enum CarType {
    SEDAN("Passenger car"), JEEP("Roadoff car "), TRUCK("Freight car");

    private String typeDescription;

    CarType(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    public String getTypeDescription() {
        return typeDescription;
    }
}//end of class
