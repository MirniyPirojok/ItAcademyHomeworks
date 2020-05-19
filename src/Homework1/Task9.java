package Homework1;

public class Task9 {
    public static void main(String[] args) {
        int first = 1;
        int second = 2;

        System.out.print("Before. First variable = " + first + ". Second variable = " + second + "\n");

        // changing
        int temp = first;
        first = second;
        second = temp;

        System.out.print("After. First variable = " + first + ". Second variable = " + second);
    }
}

