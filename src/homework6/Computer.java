package homework6;

public class Computer {
    public int weight;
    private PowerSupply powerSupply;

    public Computer() {
    }

    public Computer(int weight) {
        this.weight = weight;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    class PowerSupply {
        public static final String OWNER = "Yaroslav";
        public String model;
        private Integer price;

        public PowerSupply() {
        }

        public PowerSupply(String model, Integer price) {
            this.model = model;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }//end of inner class
}//end of class
