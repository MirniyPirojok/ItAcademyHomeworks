package homework8and9.compositeFriends.util;

import homework8and9.compositeFriends.domain.Friend;
import homework8and9.compositeFriends.domain.FriendLeader;
import homework8and9.compositeFriends.domain.Friendship;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static homework8and9.data.Names.MIDDLENAMES;
import static homework8and9.data.Names.NAMES;
import static homework8and9.data.Names.SURNAMES;

public class FriendUtil {
    public static String generateName(String[] names, String[] surnames, String[] middlenames) {
        int nameNumber = new Random().nextInt(names.length);
        int surnameNumber = new Random().nextInt(surnames.length);
        int middlenamesNumber = new Random().nextInt(middlenames.length);
        return (names[nameNumber] + " " + middlenames[middlenamesNumber] + " " + surnames[surnameNumber]);
    }

    public static Friendship generateFriend(int level) {
        return new Friend(level, generateName(NAMES, SURNAMES, MIDDLENAMES));
    }

    public static List<Friendship> generateFriendsLvl5(int friendCount) {
        List<Friendship> friends = new ArrayList<>();
        for (int i = 0; i < friendCount; i++) {
            friends.add(generateFriend(5));
        }
        return friends;
    }

    public static Friendship generateFriendLeaderLvl4(int subFriendsCount) {
        return new FriendLeader(4, generateName(NAMES, SURNAMES, MIDDLENAMES), generateFriendsLvl5(subFriendsCount));
    }

    public static List<Friendship> generateFriendLeadersLvl4(int subLeadersCount) {
        List<Friendship> friendLeaders = new ArrayList<>();
        for (int i = 0; i < subLeadersCount; i++) {
            friendLeaders.add(generateFriendLeaderLvl4(2));
        }
        return friendLeaders;
    }

}//end of class
