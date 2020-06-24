package homework6;

public class Demo {
    public static void main(String[] args) {
        Anonymous.doAnonymous();

        //task 6.3 Class Computer, inner class PowerSupply
        String powerSupplyModel = new Computer().new PowerSupply().getModel();
        System.out.println("powerSupplyModel: " + powerSupplyModel);

        System.out.println("OWNER: " + Computer.PowerSupply.OWNER);

        Computer myComputer = new Computer();
        Computer.PowerSupply powerSupply = myComputer.getPowerSupply();
        System.out.println("powerSupply: " + powerSupply);

    }//end of main
}//end of class
