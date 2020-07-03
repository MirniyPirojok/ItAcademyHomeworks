/* Task: Вывести список имен друзей пользователя до 5 уровня вложенности*/

package homework8and9;

import homework8and9.domain.Friend;

public class FriendDemo {
    public static void main(String[] args) {

        Friend mainFriend = new Friend();
        mainFriend.addFriends(5,2);
        mainFriend.print();

    }//end of main
}//end of class
