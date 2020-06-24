//task6
package homework8and9;

public class Tree {
    public static void main(String[] args) {
        User users =
                new User("Dima1",
                        new User("Anna2",
                                new User("Sasha4",
                                        new User("Andru8",
                                                new User("Slava16"),
                                                new User("Olya17")),
                                        new User("Arthur9",
                                                new User("Kolya18"),
                                                new User("Vitya19"))),
                                new User("Misha5",
                                        new User("John10",
                                                new User("Anton20"),
                                                new User("Ilya21")),
                                        new User("Michel11",
                                                new User("Ron22"),
                                                new User("Shoan23")))),
                        new User("Ivan3",
                                new User("Rachel6",
                                        new User("Jesus12",
                                                new User("Conor24"),
                                                new User("Kevin25")),
                                        new User("Sarah13",
                                                new User("Lora26"),
                                                new User("Jim27"))),
                                new User("James7",
                                        new User("Peter14",
                                                new User("Alex28"),
                                                new User("Ross29")),
                                        new User("Monica15",
                                                new User("Fibie30"),
                                                new User("Dima31")))));

        users.printTreeDepth();

    }//end of main

    static class User {
        String friend;
        User left;
        User right;

        public User(String friend) {
            this.friend = friend;
        }

        public User(String friend, User left, User right) {
            this.friend = friend;
            this.left = left;
            this.right = right;
        }

        public void printTreeDepth() {

            if (left != null) {
                left.printTreeDepth();
            }

            if (right != null) {
                right.printTreeDepth();
            }

            System.out.println(this);
        }

        @Override
        public String toString() {
            return friend + " {friends: " + left + ", " + right + "}";
        }
    }
}//end of class
