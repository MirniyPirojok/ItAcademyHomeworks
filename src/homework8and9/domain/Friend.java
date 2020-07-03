package homework8and9.domain;

import java.util.ArrayList;
import java.util.List;

import static homework8and9.util.FriendUtil.generateFriendName;

public class Friend {
    private int level = 1;

    private String name = "Slava";

    private List<Friend> friendList;

    public Friend() {
    }

    public Friend(int level, String name) {
        this.level = level;
        this.name = name;
    }

    //add friends using recursion
    public void addFriends(int levelsCount, int friendsCount) {
        this.friendList = new ArrayList<>();
        if (this.level < levelsCount) { //check level
            int newLevel = this.level + 1;
            for (int i = 0; i < friendsCount; i++) { //add subfriends
                this.friendList.add(new Friend(newLevel, generateFriendName()));
            }
            for (Friend friend : friendList) { //add friends to subfriends
                friend.addFriends(levelsCount, friendsCount);
            }
        }
    }

    String findSubFriendsNames() {
        StringBuilder friendNames = new StringBuilder();
        for (Friend friendLeader : this.friendList) {
            friendNames.append(friendLeader.name).append("(level ").append(friendLeader.level).append(") ");
        }
        return friendNames.toString();
    }

    public void print() {
        if (!this.friendList.isEmpty()) { //if friend has friends then print his level name and friend list
            System.out.println("Level " + this.level + ". " + this.name + " has friends: " + findSubFriendsNames().trim() + ".");
            for (Friend friend : friendList) {
                friend.print();
            }
        }
    }
}//end of class