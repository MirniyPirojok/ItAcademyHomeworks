package homework1;

public class Task1 {
    public final static double MOON_GRAVITY = 0.16;

    public static void main(String[] args) {
        double weight = 75.5;
        double moonWeight = weight * MOON_GRAVITY;
        System.out.println("My wight = " + weight + "kg");
        System.out.println("My weight on the Moon = " + moonWeight + "kg");
    }
}
