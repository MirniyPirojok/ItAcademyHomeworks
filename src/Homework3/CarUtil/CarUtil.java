package Homework3.CarUtil;

import Homework3.Main;
import Homework3.domain.Car;

import java.util.Random;

public class CarUtil {

    public static Car generateCar(){
        Car car = new Car();
        car.setWeight(CarUtil.generateCarWeight());
        car.setType(CarUtil.defineCarType(car));
        return car;
    }

    public static int generateCarWeight() {
        return new Random().nextInt(4)+1;
    }

    public static String defineCarType(Car car){
        String type = "Unknown";

        switch (car.getWeight()){
            case 1:
                type = "passenger car";
                break;
            case 2:
                type = "jeep";
                break;
            case 3:
            case 4:
            case 5:
                type = "truck";
                break;
        }
        return type;
    }
}
