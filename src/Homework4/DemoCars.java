package Homework4;

import Homework4.domain.Car;
import Homework4.domain.Transport;

import static Homework4.util.CarsUtil.countSum;
import static Homework4.util.CarsUtil.generateCars;
import static Homework4.util.CarsUtil.showCars;
import static Homework4.util.CarsUtil.sortCars;


public class DemoCars {
    public static void main(String[] args) {
        String sortCarsById = "sortCarsById",
                sortCarsByWeight = "sortCarsByWeight",
                sortCarsByMaxSpeed = "sortCarsByMaxSpeed",
                sortCarsByPrice = "sortCarsByPrice";
        String sumOfWeights = "sumOfWeights",
                sumOfPrices = "sumOfPrices";

        Car[] cars = generateCars(6);

        showCars(cars);
        sortCars(cars, sortCarsByWeight);
        showCars(cars);
        sortCars(cars, sortCarsByMaxSpeed);
        showCars(cars);
        sortCars(cars, sortCarsById);
        showCars(cars);


        countSum(cars, sumOfPrices);
        countSum(cars, sumOfWeights);


        cars[0].upgrade(11);
        cars[1].downgrade(22);
        System.out.print("\nCar " + cars[2].getId());
        cars[2].raisePrice(500);
        System.out.print("\nCar " + cars[3].getId());
        cars[3].reducePrice(300);
        showCars(cars);


        //checking work of equals and hashCode
        System.out.println("\nMake car" + cars[4].getId() + " and car" + cars[5].getId() + " equal for checking equals() and hashCode().");
        cars[4].setWeight(3);
        cars[4].setType("truck");
        cars[4].setMaxSpeed(160);
        cars[4].setPrice(2000);

        cars[5].setWeight(3);
        cars[5].setType("truck");
        cars[5].setMaxSpeed(160);
        cars[5].setPrice(2000);

        sortCars(cars, sortCarsByPrice);
        showCars(cars);


        System.out.println("\nIs car" + cars[0].getId() + " and car" + cars[1].getId() + " equal? " + cars[0].equals(cars[1]));
        System.out.println("Is hashcode car" + cars[0].getId() + " and car" + cars[1].getId() + " equal? " + (cars[0].hashCode() == cars[1].hashCode()));

        System.out.println("\nIs car" + cars[2].getId() + " and car" + cars[3].getId() + " equal? " + cars[2].equals(cars[3]));
        System.out.println("Is hashcode car" + cars[2].getId() + " and car" + cars[3].getId() + " equal? " + (cars[2].hashCode() == cars[3].hashCode()));

        System.out.println("\nIs car" + cars[4].getId() + " and car" + cars[5].getId() + " equal? " + cars[4].equals(cars[5]));
        System.out.println("Is hashcode car" + cars[4].getId() + " and car" + cars[5].getId() + " equal? " + (cars[4].hashCode() == cars[5].hashCode()));

        Transport transport = new Transport();
        transport.downgrade(1);
        System.out.println("Transport weight = " + transport.getWeight());
        transport.upgrade(1);
        System.out.println("Transport weight = " + transport.getWeight());


    }//end of main
}//end of class
