package homework1;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hours, minutes, seconds;

        System.out.print("\nEnter days amount: ");
        int daysAmount = in.nextInt();

        hours = daysAmount * 24;
        minutes = daysAmount * 24 * 60;
        seconds = daysAmount * 24 * 60 * 60;

        System.out.println("Hours: " +hours+ ". Minutes: " +minutes+ ". Seconds: " +seconds);

    }
}
