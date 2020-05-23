/*Создать класс Car с 3 полями различных типов, 2 конструкторами, один из которых с параметрами.
В классе создать 2 метода, статический и не статический.
Один из методов решает по весу машины ее тип: легковой, джип, грузовой (через свитч).
Второй метод генерирует рандомную машину.*/

package Homework3.domain;

public class Car {
    private static final String carOwner = "Yaroslav";
    private int weight;
    private String type;

    public Car() {
    }

    public Car(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public static String getCarOwner() {
        return carOwner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
