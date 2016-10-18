/**
 * Created by win on 2016-10-18.
 */
public class WashroomUser extends Thread {
    Washroom washroom;
    String strUser;

    public WashroomUser(String user, Washroom mywashroom){
        this.washroom = mywashroom;
        this.strUser = user;
    }

    @Override
    public void run(){
        washroom.useWashroom(strUser);
    }
}
