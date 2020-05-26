/*Создать класс Car с 3 полями различных типов, 2 конструкторами, один из которых с параметрами.
В классе создать 2 метода, статический и не статический.
Один из методов решает по весу машины ее тип: легковой, джип, грузовой (через свитч).
Второй метод генерирует рандомную машину.*/

package Homework3;

import Homework3.CarUtil.CarUtil;
import Homework3.domain.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = CarUtil.generateCar();
        Car car2 = CarUtil.generateCar();
        Car car3 = CarUtil.generateCar();
        Car car4 = CarUtil.generateCar();
        Car car5 = CarUtil.generateCar();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }

}
