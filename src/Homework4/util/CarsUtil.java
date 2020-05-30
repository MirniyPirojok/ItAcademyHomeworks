package Homework4.util;

import Homework4.domain.Car;

import java.util.Random;

public class CarsUtil {

    public static Car generateCar() {
        Car car = new Car();
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
            cars[i] = generateCar();
        }
        return cars;
    }

    public static void showCars(Car[] cars) {
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.println("car " + (i + 1) + " : " + cars[i]);
        }
    }

    public static void carsSort(Car[] cars, String criteria) {
        switch (criteria) {
            case "sortByWeight":
                sortCarsByWeight(cars);
                break;
            case "sortByMaxSpeed":
                sortCarsByMaxSpeed(cars);
                break;
            case "sortByPrice":
                sortCarsByPrice(cars);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + criteria);
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

    public static void sumOfWeights(Car[] cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.getWeight();
        }
        System.out.println("\nTotal weight of all cars = " + sum + " ton");
    }


}//end of class
