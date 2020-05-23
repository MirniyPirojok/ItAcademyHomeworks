package Homework3;

import Homework3.CarUtil.CarUtil;
import Homework3.domain.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setWeight(CarUtil.generateCarWeight());
        car.setType(CarUtil.defineCarType(car.getWeight()));

        System.out.println("\nCar owner: " + Car.getCarOwner());
        System.out.println("New car weight: " + car.getWeight() + " ton");
        System.out.println("Car type: " + car.getType());
    }
}
