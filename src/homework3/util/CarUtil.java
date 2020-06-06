package homework3.util;

import homework3.domain.Car;

import java.util.Random;

public class CarUtil {
    public static final String PASSENGER_CAR = "passenger car";
    public static final String JEEP = "jeep";
    public static final String TRUCK = "truck";


    public static Car generateCar() {
        Car car = new Car();
        car.setWeight(generateWeight());
        defineCarType(car);
        return car;
    }

    public static void defineCarType(Car car) {
        switch (car.getWeight()) {
            case 1:
                car.setType(PASSENGER_CAR);
                break;
            case 2:
                car.setType(JEEP);
                break;
            case 3:
                car.setType(TRUCK);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + car.getWeight());
        }
    }

    private static int generateWeight() {
        //from 1 to 3 values
        return new Random().nextInt(3) + 1;
    }

}//end of class
