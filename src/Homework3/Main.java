/*Создать класс Car с 3 полями различных типов, 2 конструкторами, один из которых с параметрами.
В классе создать 2 метода, статический и не статический.
Один из методов решает по весу машины ее тип: легковой, джип, грузовой (через свитч).
Второй метод генерирует рандомную машину.*/

package Homework3;

import Homework3.CarUtil.CarUtil;
import Homework3.domain.Car;

public class Main {
    public static void main(String[] args) {

        Car car = CarUtil.generateCar();

        System.out.println(car);
    }
}
