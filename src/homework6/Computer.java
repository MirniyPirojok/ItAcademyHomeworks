package homework6;

public class Computer {
    public int price;
    private PowerSupply powerSupply;

    public Computer() {
    }

    public Computer(int price) {
        this.price = price;
        this.powerSupply = new PowerSupply();
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public int getPrice() {
        return price;
    }

    //task 6.2 Create local class, create method and call method через вызов метода, внутри которого описан класс
    public void setPrice(int price) {
        //crate local class
        class Price {
            private int price;

            public Price(int price) {
                this.price = price;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }
        }
        this.price = new Price(price).getPrice();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "weight=" + price +
                ", powerSupply=" + powerSupply +
                '}';
    }

    // Inner class
    class PowerSupply {
        public static final String OWNER = "Yaroslav";
        public String model;


        public PowerSupply() {
        }

        public PowerSupply(String model) {
            this.model = model;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

    }//end of inner class
}//end of class
