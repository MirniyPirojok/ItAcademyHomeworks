package OOP.util;

import OOP.domain.Car;
import OOP.domain.SortBy;
import OOP.domain.SumOf;

import java.util.Random;

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
                car.setType("sedan");
                car.setMaxSpeed(180);
                break;
            case 2:
                car.setType("jeep");
                car.setMaxSpeed(160);
                break;
            case 3:
                car.setType("truck");
                car.setMaxSpeed(140);
                break;
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
                sortCarsById(cars);
                break;
            case WEIGHT:
                sortCarsByWeight(cars);
                break;
            case MAXSPEED:
                sortCarsByMaxSpeed(cars);
                break;
            case PRICE:
                sortCarsByPrice(cars);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + criteria);
        }
    }

    public static void sortCarsById(Car[] cars) {
        System.out.println("\nCars were sorted by id: ");
        Car temp;
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getId() > cars[j + 1].getId()) {
                    temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    public static void sortCarsByWeight(Car[] cars) {
        System.out.println("\nCars were sorted by weight: ");
        Car temp;
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getWeight() > cars[j + 1].getWeight()) {
                    temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    public static void sortCarsByMaxSpeed(Car[] cars) {
        System.out.println("\nCars were sorted by max speed: ");
        Car temp;
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getMaxSpeed() > cars[j + 1].getMaxSpeed()) {
                    temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    public static void sortCarsByPrice(Car[] cars) {
        System.out.println("\nCars were sorted by price: ");
        Car temp;
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getPrice() > cars[j + 1].getPrice()) {
                    temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
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
