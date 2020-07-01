package homework8and9.compositeFriends.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FriendLeader implements Friendship {
    private final int level;
    private final String name;

    List<Friendship> friends = new ArrayList<>();

    public FriendLeader(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public FriendLeader(int level, String name, List<Friendship> friends) {
        this.level = level;
        this.name = name;
        this.friends = friends;
    }

    public void add(Friendship newFriend) {
        friends.add(newFriend);
    }

    public void add(Friendship... newFriends) {
        friends.addAll(Arrays.asList(newFriends));
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void print() {
        System.out.println("\nLevel " + getLevel() + ". " + getName() + ", his Friends: ");

        for (Friendship friend : friends) {
            friend.print();
        }
    }


}//end of class
