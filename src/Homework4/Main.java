package Homework4;

import Homework4.domain.Car;

import static Homework4.util.CarsUtil.generateCars;
import static Homework4.util.CarsUtil.showCars;
import static Homework4.util.CarsUtil.sortCarsByWeight;
import static Homework4.util.CarsUtil.sumOfWeights;


public class Main {
    public static void main(String[] args) {
        Car[] cars = generateCars(5);

        showCars(cars);
        sortCarsByWeight(cars);
        sumOfWeights(cars);

        cars[0].upgrade(11);
        System.out.println("\nUpgrade car 1: " + cars[0]);

        cars[1].downgrade(22);
        System.out.println("\nDowngrade car 2: " + cars[1]);



    }//end of main
}//end of class
