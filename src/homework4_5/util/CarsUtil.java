package homework4_5.util;

import homework4_5.domain.Car;
import homework4_5.domain.SortBy;
import homework4_5.domain.SumOf;
import homework4_5.domain.Transport;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import static homework4_5.domain.CarType.JEEP;
import static homework4_5.domain.CarType.SEDAN;
import static homework4_5.domain.CarType.TRUCK;


public class CarsUtil {

        public static Car generateCar(int id) {
        Car car = new Car(id);
        car.setWeight(new Random().nextInt(3) + 1);
        defineCarType(car);
        return car;
    }

    public static void defineCarType(Car car) {
        switch (car.getWeight()) {
            case 1:
                car.setType(SEDAN);
                car.setMaxSpeed(180);
                break;
            case 2:
                car.setType(JEEP);
                car.setMaxSpeed(160);
                break;
            case 3:
                car.setType(TRUCK);
                car.setMaxSpeed(140);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + car.getWeight());
        }
    }

    public static Car[] generateCars(int num) {
        Car[] cars = new Car[num];
        for (int i = 0; i < num; i++) {
            cars[i] = generateCar(i+1);
        }
        return cars;
    }

    public static void showCars(Car[] cars) {
        System.out.println();
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    //sort by criteria
    //choose sort criteria
    public static void sortCars(Car[] cars, SortBy criteria) {
        switch (criteria) {
            case ID:
                System.out.println("\nCars were sorted by id: ");
                Arrays.sort(cars, Comparator.comparing(Car::getId));
                break;
            case WEIGHT:
                System.out.println("\nCars were sorted by weight: ");
                Arrays.sort(cars, Comparator.comparing(Car::getWeight));
                break;
            case MAXSPEED:
                System.out.println("\nCars were sorted by max speed: ");
                Arrays.sort(cars, Comparator.comparing(Car::getMaxSpeed));
                break;
            case PRICE:
                System.out.println("\nCars were sorted by price: ");
                Arrays.sort(cars, Comparator.comparing(Car::getPrice));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + criteria);
        }
    }

    //count sum by criteria
    //choose sum criteria
    public static void countSum(Car[] cars, SumOf criteria) {
        switch (criteria) {
            case WEIGHTS:
                sumOfWeights(cars);
                break;
            case PRICES:
                sumOfPrices(cars);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + criteria);
        }
    }

    public static void sumOfWeights(Car[] cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getWeight();
        }
        System.out.println("\nTotal weight of all cars = " + sum + " ton");
    }

    public static void sumOfPrices(Car[] cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        System.out.println("\nTotal price of all cars = " + sum);
    }
}//end of class
