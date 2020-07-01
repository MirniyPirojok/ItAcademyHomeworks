package homework8and9.compositeFriends.domain;

public class Friend implements Friendship {

    private final int level;
    private final String name;

    public Friend(int level, String name) {
        this.level = level;
        this.name = name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.print("Level " + getLevel() + ". " + getName() + ". \n");
    }

    public void add(Friendship newFriend) {
    }

}//end of class
