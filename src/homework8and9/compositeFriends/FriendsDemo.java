package homework8and9.compositeFriends;

import homework8and9.compositeFriends.domain.FriendLeader;
import homework8and9.compositeFriends.domain.Friendship;

import static homework8and9.compositeFriends.util.FriendUtil.generateFriendLeadersLvl4;
import static homework8and9.compositeFriends.util.FriendUtil.generateName;
import static homework8and9.data.Names.MIDDLENAMES;
import static homework8and9.data.Names.NAMES;
import static homework8and9.data.Names.SURNAMES;

public class FriendsDemo {

    public static void main(String[] args) {

        Friendship friendLeader3 = new FriendLeader(3, generateName(NAMES, SURNAMES, MIDDLENAMES), generateFriendLeadersLvl4(1));
        Friendship friendLeader4 = new FriendLeader(3, generateName(NAMES, SURNAMES, MIDDLENAMES), generateFriendLeadersLvl4(1));
        Friendship friendLeader5 = new FriendLeader(3, generateName(NAMES, SURNAMES, MIDDLENAMES), generateFriendLeadersLvl4(1));
        Friendship friendLeader6 = new FriendLeader(3, generateName(NAMES, SURNAMES, MIDDLENAMES), generateFriendLeadersLvl4(1));

        FriendLeader friendLeader1 = new FriendLeader(2, "Misha");
        friendLeader1.add(friendLeader3);
        friendLeader1.add(friendLeader4);

        FriendLeader friendLeader2 = new FriendLeader(2, "Anton");
        friendLeader2.add(friendLeader5);
        friendLeader2.add(friendLeader6);

        FriendLeader mainFriend = new FriendLeader(1, "Slava");
        mainFriend.add(friendLeader1);
        mainFriend.add(friendLeader2);

        mainFriend.print();

    }//end of main
}//end of class
