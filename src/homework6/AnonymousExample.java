package homework6;

import homework4_5.domain.Car;

public class AnonymousExample {
    public static void example() {
        Car car = new Car() {
            @Override
            public String toString() {
                return "it is anonymous car";
            }
        };
        System.out.println(car);
    }
}//end of class
