package Homework4;

import Homework4.domain.Car;
import Homework4.domain.Technology;
import Homework4.domain.Transport;

import static Homework4.util.CarsUtil.generateCars;
import static Homework4.util.CarsUtil.showCars;
import static Homework4.util.CarsUtil.sortCarsByWeight;
import static Homework4.util.CarsUtil.sumOfWeights;


public class DemoCars {
    public static void main(String[] args) {
        Car[] cars = generateCars(6);

        showCars(cars);
        sortCarsByWeight(cars);
        showCars(cars);
        sumOfWeights(cars);

        cars[0].upgrade(11);
        System.out.println("\nUpgrade car 1: " + cars[0]);

        cars[1].downgrade(22);
        System.out.println("Downgrade car 2: " + cars[1]);

        cars[2].raisePrice(500);
        System.out.println("\nRaise price of car 3: " + cars[2]);

        cars[3].reducePrice(300);
        System.out.println("Reduce price of car 4: " + cars[3]);

        //checking work of equals and hashCode
        cars[2].setWeight(3);
        cars[2].setType("truck");
        cars[2].setMaxSpeed(160);
        cars[2].setPrice(2000);

        cars[3].setWeight(3);
        cars[3].setType("truck");
        cars[3].setMaxSpeed(160);
        cars[3].setPrice(2000);

        showCars(cars);

        System.out.println("\nIs car1 and car2 equal? " + cars[0].equals(cars[1]));
        System.out.println("Is hashcode car1 and car2 equal? " + (cars[0].hashCode()==cars[1].hashCode()));

        System.out.println("\nIs car3 and car4 equal? " + cars[2].equals(cars[3]));
        System.out.println("Is hashcode car3 and car4 equal? " + (cars[2].hashCode()==cars[3].hashCode()));

        System.out.println("\nIs car5 and car6 equal? " + cars[4].equals(cars[5]));
        System.out.println("Is hashcode car5 and car6 equal? " + (cars[4].hashCode()==cars[5].hashCode()));


    }//end of main
}//end of class
