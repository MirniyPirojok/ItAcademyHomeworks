/*Создать класс Car с 3 полями различных типов, 2 конструкторами, один из которых с параметрами.
В классе создать 2 метода, статический и не статический.
Один из методов решает по весу машины ее тип: легковой, джип, грузовой (через свитч).
Второй метод генерирует рандомную машину.*/

package homework3;

import homework3.util.CarUtil;

public class Main {
    public static void main(String[] args) {

        homework3.domain.Car car1 = CarUtil.generateCar();
        homework3.domain.Car car2 = CarUtil.generateCar();
        homework3.domain.Car car3 = CarUtil.generateCar();
        homework3.domain.Car car4 = CarUtil.generateCar();
        homework3.domain.Car car5 = CarUtil.generateCar();

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }

}
