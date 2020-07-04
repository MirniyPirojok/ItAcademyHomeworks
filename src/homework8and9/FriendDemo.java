/* Task: Вывести список имен друзей пользователя до 5 уровня вложенности*/

package homework8and9;

import homework8and9.domain.Friend;

public class FriendDemo {
    public static void main(String[] args) {

        Friend mainFriend = new Friend();
        mainFriend.addFriends(5, 2);

        mainFriend.print1();//print in the first way

        System.out.println();

        mainFriend.print2();//print in the second way
    }//end of main
}//end of class
