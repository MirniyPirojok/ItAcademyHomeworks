package homework1;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter minimum: ");
        int min = in.nextInt();

        System.out.print("Enter maximum: ");
        int max = in.nextInt();

        System.out.print("Enter step: ");
        int step = in.nextInt();

        in.close();

        System.out.print("Natural numbers: ");
        for (int i = min; i <= max; i += step) {
            System.out.print(i + " ");
        }
    }
}
