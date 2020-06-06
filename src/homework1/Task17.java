package homework1;

public class Task17 {
    public static void main(String[] args) {
        int n = HomeworkUtil.generateArraySize();
        double arr[] = new double[n];

        // arr filling
        System.out.print("Array numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 + 1);
            System.out.print(" " + (int) arr[i]);
        }

        // searching max element
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.print("\nMaximum: " + (int) max);

        // dividing
        System.out.print("\nArray dividing:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] /= max;
            System.out.print(" " + arr[i]);
        }
    }
}
