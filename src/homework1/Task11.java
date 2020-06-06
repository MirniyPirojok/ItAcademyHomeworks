package homework1;

import static homework1.HomeworkUtil.generateDoubleValue;

public class Task11 {
    public static void main(String[] args) {
        double x = generateDoubleValue();
        double y = generateDoubleValue();
        double z = generateDoubleValue();

        System.out.println("Numbers before comparison: x = " + x + " y = " + y + " z = " + z);

        System.out.print("The biggest number = ");
        if (x > y && x > z) {
            System.out.print(x);
        } else {
            System.out.print(Math.max(z, y));
        }
    }
}
