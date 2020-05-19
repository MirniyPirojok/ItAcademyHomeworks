package Homework1;

public class Task11 {
    public static void main(String[] args) {
        int x = (int) (Math.random()*100+1);
        int y = (int) (Math.random()*100+1);
        int z = (int) (Math.random()*100+1);

        System.out.println("Numbers before comparison: x=" + x +" y=" + y +" z=" + z);

        System.out.print("The biggest number = ");
        if (x > y && x > z)
            System.out.print(x);
            else if (z > y)
                System.out.print(z);
                else System.out.print(y);

        }

}
