package homework1;

public class Task14 {
    public static void main(String[] args) {
        int x = HomeworkUtil.generateIntValue();
        int y = HomeworkUtil.generateIntValue();

        System.out.println("Numbers before: x=" + x + " y=" + y);

        if (x > y)
            x += 3;
        else
            y += 8;

        System.out.println("Numbers after: x=" + x + " y=" + y);
    }
}
