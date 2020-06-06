package homework1;

public class Task2 {
    public static void main(String[] args) {
        int n = HomeworkUtil.generateArraySize(); //array size
        double arr[] = new double[n];

        // array filling
        System.out.print("Default array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = HomeworkUtil.generateDoubleValue();
            System.out.print(" " + arr[i]);
        }

        // arr changing
        increaseArr(arr);

        // print changed array        
        System.out.print("\nChanged array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    // increase elements on 10%
    public static void increaseArr(double arr[]) {
        final float multiplier = 0.1f;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += arr[i] * multiplier;
        }
    }

}
