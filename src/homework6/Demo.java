package homework6;


public class Demo {
    public static void main(String[] args) {

        //task 6.1
        AnonymousExample.example();
        System.out.println();

        //task 6.3
        String powerSupplyModel = new Computer().new PowerSupply().getModel();
        System.out.println(powerSupplyModel);
        System.out.println(Computer.PowerSupply.OWNER);

        Computer computer = new Computer();
        Computer.PowerSupply powerSupply = computer.getPowerSupply();
        System.out.println(powerSupply);



    }//end of main
}//end of class
