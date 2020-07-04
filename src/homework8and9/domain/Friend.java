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
    public void addFriends(int levelsCount, int friendsOnLevel) {
        this.friendList = new ArrayList<>();
        if (this.level < levelsCount) { //check level
            int newLevel = this.level + 1;
            for (int i = 0; i < friendsOnLevel; i++) { //add subfriends
                this.friendList.add(new Friend(newLevel, generateFriendName()));
            }
            for (Friend friend : friendList) { //add friends to subfriends
                friend.addFriends(levelsCount, friendsOnLevel);
            }
        }
    }

    //first way to print friends list
    String findSubFriendsNames() {
        StringBuilder friendNames = new StringBuilder();
        for (Friend friendLeader : this.friendList) {
            friendNames.append(friendLeader.name).append("(level ").append(friendLeader.level).append(") ");
        }
        return friendNames.toString();
    }

    public void print1() {
        if (!this.friendList.isEmpty()) { //if friend has friends then print his level name and friend list
            System.out.println("Level " + this.level + ". " + this.name + " has friends: " + this.findSubFriendsNames().trim() + ".");
            for (Friend friend : friendList) {
                friend.print1();
            }
        }
    }

    //second way to print friends list
    static StringBuilder lvl1 = new StringBuilder();
    static StringBuilder lvl2 = new StringBuilder();
    static StringBuilder lvl3 = new StringBuilder();
    static StringBuilder lvl4 = new StringBuilder();
    static StringBuilder lvl5 = new StringBuilder();

    // put friends on the same level together using recursion
    public void findFriendsOnTheSameLevel() {
        switch (this.level) {
            case 1:
                lvl1.append(this.name).append(". ");
                break;
            case 2:
                lvl2.append(this.name).append(". ");
                break;
            case 3:
                lvl3.append(this.name).append(". ");
                break;
            case 4:
                lvl4.append(this.name).append(". ");
                break;
            case 5:
                lvl5.append(this.name).append(". ");
        }
        for (Friend friend : this.friendList) {
            friend.findFriendsOnTheSameLevel();
        }
    }

    public void print2() {
        this.findFriendsOnTheSameLevel();
        System.out.println(
                "Level 1: " + lvl1.toString() + "\n" +
                        "Level 2: " + lvl2.toString() + "\n" +
                        "Level 3: " + lvl3.toString() + "\n" +
                        "Level 4: " + lvl4.toString() + "\n" +
                        "Level 5: " + lvl5.toString());
    }
}//end of class