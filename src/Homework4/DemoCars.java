package Homework4;

import Homework4.domain.Car;
import Homework4.domain.Transport;


import static Homework4.util.CarsUtil.generateCars;
import static Homework4.util.CarsUtil.sortCars;
import static Homework4.util.CarsUtil.countSum;
import static Homework4.util.CarsUtil.showCars;



public class DemoCars {
    public static void main(String[] args) {
        String sortByWeight = "sortByWeight", sortByMaxSpeed = "sortByMaxSpeed", sortByPrice = "sortByPrice";
        String sumOfWeights = "sumOfWeights", sumOfPrices = "sumOfPrices";

        Car[] cars = generateCars(6);

        showCars(cars);
        sortCars(cars, sortByWeight);
        showCars(cars);
        sortCars(cars, sortByMaxSpeed);
        showCars(cars);

        countSum(cars, sumOfPrices);
        countSum(cars, sumOfWeights);


        cars[0].upgrade(11);
        System.out.println("\nUpgrade   car 1: " + cars[0]);

        cars[1].downgrade(22);
        System.out.println("Downgrade car 2: " + cars[1]);

        cars[2].raisePrice(500);
        System.out.println("\nRaise price of car 3: " + cars[2]);

        cars[3].reducePrice(300);
        System.out.println("Reduce price of car 4: " + cars[3]);

        //checking work of equals and hashCode
        cars[4].setWeight(3);
        cars[4].setType("truck");
        cars[4].setMaxSpeed(160);
        cars[4].setPrice(2000);

        cars[5].setWeight(3);
        cars[5].setType("truck");
        cars[5].setMaxSpeed(160);
        cars[5].setPrice(2000);

        sortCars(cars, sortByPrice);
        showCars(cars);

        System.out.println("\nIs car1 and car2 equal? " + cars[0].equals(cars[1]));
        System.out.println("Is hashcode car1 and car2 equal? " + (cars[0].hashCode() == cars[1].hashCode()));

        System.out.println("\nIs car3 and car4 equal? " + cars[2].equals(cars[3]));
        System.out.println("Is hashcode car3 and car4 equal? " + (cars[2].hashCode() == cars[3].hashCode()));

        System.out.println("\nIs car5 and car6 equal? " + cars[4].equals(cars[5]));
        System.out.println("Is hashcode car5 and car6 equal? " + (cars[4].hashCode() == cars[5].hashCode()));

        Transport transport = new Transport();
        transport.downgrade(1);
        System.out.println("Transport weight = " + transport.getWeight());


    }//end of main
}//end of class
