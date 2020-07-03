package homework8and9.util;

import java.util.Random;

import static homework8and9.data.Names.NAMES;
import static homework8and9.data.Names.SURNAMES;

public class FriendUtil {

    public static String generateFriendName() {
        int nameNumber = new Random().nextInt(NAMES.length);
        int surnameNumber = new Random().nextInt(SURNAMES.length);
        return (NAMES[nameNumber] + " " + SURNAMES[surnameNumber]);
    }

}//end of class
