package practicexml.parsers;

import java.util.Objects;

public class Car {
    int id;
    int productionDate;
    int price;

    long vin;

    String model;

    public Car() {
    }

    public Car(int id, int productionDate, int price, long vin, String model) {
        this.id = id;
        this.productionDate = productionDate;
        this.price = price;
        this.vin = vin;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                productionDate == car.productionDate &&
                price == car.price &&
                vin == car.vin &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productionDate, price, vin, model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", productionDate=" + productionDate +
                ", price=" + price +
                ", vin=" + vin +
                ", model='" + model + '\'' +
                '}';
    }
}//end of class
