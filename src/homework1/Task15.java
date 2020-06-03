package homework1;

public class Task15 {
    public static void main(String[] args) {

        System.out.println("Cycle \"for\":");
        for (int i = 1; i <= 100 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nCycle \"while\":");
        int i = 1;
        while (i<=100) {
            System.out.print(i + " ");
            i += 1;
        }

        System.out.println("\nCycle \"do while\":");
        int x = 1;
        do {
            System.out.print(x + " ");
            x += 1;
        }
        while (x<=100);
    }
}
