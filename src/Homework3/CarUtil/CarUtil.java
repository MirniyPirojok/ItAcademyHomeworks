package Homework3.CarUtil;

import Homework3.Main;
import Homework3.domain.Car;

import java.util.Random;

public class CarUtil {
    public static int generateCarWeight() {
        return new Random().nextInt(4)+1;
    }

    public static String  defineCarType(int weight){

        String type = "Unknown";
        switch (weight){
            case 1:
                type = "Passenger car";
                break;
            case 2:
                type = "Jeep";
                break;
            case 3:
            case 4:
            case 5:
                type = "Truck";
                break;
        }
        return type;
    }
}
