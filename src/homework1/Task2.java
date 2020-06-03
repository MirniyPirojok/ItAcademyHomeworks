package homework1;

public class Task2 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10); //array size
        double arr[] = new double[n];

        // array filling
        System.out.print("Default array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            System.out.print(" " + (int) arr[i]);
        }

        // arr changing
        increaseArr(arr);

        // print changed array        
        System.out.print("\nChanged array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    // array changing method
    public static void increaseArr(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += arr[i] * 0.1;
        }
    }
}
