package homework1;

public class Task11 {
    public static void main(String[] args) {
        double x = HomeworkUtil.generateDoubleValue();
        double y = HomeworkUtil.generateDoubleValue();
        double z = HomeworkUtil.generateDoubleValue();

        System.out.println("Numbers before comparison: x = " + x + " y = " + y + " z = " + z);

        System.out.print("The biggest number = ");
        if (x > y && x > z) {
            System.out.print(x);
        } else {
            if (z > y) {
                System.out.print(z);
            } else {
                System.out.print(y);
            }
        }
    }
}
