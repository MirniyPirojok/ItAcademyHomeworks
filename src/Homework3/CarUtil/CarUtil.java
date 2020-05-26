package Homework3.CarUtil;

import Homework3.domain.Car;

import java.util.Random;

public class CarUtil {

    public static Car generateCar() {
        Car car = new Car();
        car.setWeight(new Random().nextInt(3) + 1);
        defineCarType(car);
        return car;
    }

    public static void defineCarType(Car car) {
        switch (car.getWeight()) {
            case 1:
                car.setType("passenger car");
                break;
            case 2:
                car.setType("jeep");
                break;
            case 3:
                car.setType("truck");
                break;
        }
    }
}
