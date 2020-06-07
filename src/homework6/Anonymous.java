//task 6.1 Create anonymous class for object and run method that was overrided.

package homework6;

public class Anonymous {
    public static void doAnonymous() {
        Computer anonymousComputer = new Computer() {
            @Override
            public String toString() {
                return "Here is anonymous computer.";
            }
        };
        System.out.println(anonymousComputer);
    }
}//end of class
