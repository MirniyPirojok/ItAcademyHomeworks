package homework4and5.util;

import homework4and5.domain.Car;
import homework4and5.domain.SortBy;
import homework4and5.domain.SumOf;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Function;

import static homework4and5.domain.CarType.JEEP;
import static homework4and5.domain.CarType.SEDAN;
import static homework4and5.domain.CarType.TRUCK;


public class CarsUtil {

    public static Car generateCar(int id) {
        Car car = new Car(id);
        car.setWeight(generateWeight());
        defineCarType(car);
        return car;
    }

    private static int generateWeight() {
        //from 1 to 3 values
        return new Random().nextInt(3) + 1;
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
            cars[i] = generateCar(i + 1);
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
            case MAX_SPEED:
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

    //choose criteria of sum
    public static void countSum(Car[] cars, SumOf criteria) {
        int sum;
        switch (criteria) {
            case WEIGHTS:
                sum = sumOf(cars, Car::getWeight);
                System.out.print("\nTotal weight of all cars = " + sum + " ton");
                break;
            case PRICES:
                sum = sumOf(cars, Car::getPrice);
                System.out.print("\nTotal price of all cars = " + sum);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + criteria);
        }
    }

    //count sum by criteria
    public static int sumOf(Car[] cars, Function<Car, Integer> selector) {
        int sum = 0;
        for (Car car : cars) {
            sum += selector.apply(car);
        }
        return sum;
    }
}//end of class
