package Homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = in.nextLine();

        isPalindrome(num);
    }

    //method palindrome checking
    public static void isPalindrome(String num){
        char arr[] = num.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length/2 ; i++) {
            if (arr[i] != arr[arr.length-i-1]) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("Number is palindrome.");
        else
            System.out.println("Number is not palindrome.");
    }
}