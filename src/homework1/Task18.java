package homework1;

import java.math.BigDecimal;
import java.math.RoundingMode;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nEnter rubles amount: ");
        double rubles = in.nextDouble();

        System.out.print("Enter how much one dollar costs: ");
        double rate = in.nextDouble();

        double dollars = exchange(rubles, rate);
        System.out.println("Dollars amount will be: " + dollars);

    }

    private static double exchange(double rubles, double rate) {
        double dollars = rubles/rate;
        dollars = new BigDecimal(dollars).setScale(2, RoundingMode.HALF_UP).doubleValue();
        return dollars;
    }
}
