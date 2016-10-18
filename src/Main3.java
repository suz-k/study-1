import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by win on 2016-10-18.
 */
public class Main3 {

    public static void main(String[] args) {

        Washroom washroom = new Washroom();
        ArrayList<WashroomUser> arrayWashroomUsers = new ArrayList<>();

        for(int i=1;i<=10;i++) {
            arrayWashroomUsers.add(new WashroomUser("사용자"+i, washroom));
        }

        for(WashroomUser washroomUser: arrayWashroomUsers) {
            washroomUser.start();
        }
    }
}
