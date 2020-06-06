package homework1;

import java.util.Scanner;

public class Task19 {
    public static final int HOURS = 24;
    public static final int MINUTES = 60;
    public static final int SECONDS = 60;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.print("\nEnter days amount: ");
        int daysAmount = in.nextInt();
        in.close();

        int hours = daysAmount * HOURS;
        int minutes = daysAmount * HOURS * MINUTES;
        int seconds = daysAmount * HOURS * MINUTES * SECONDS;

        System.out.println("Hours: " + hours + ". Minutes: " + minutes + ". Seconds: " + seconds);

    }
}
