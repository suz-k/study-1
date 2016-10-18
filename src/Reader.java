/**
 * Created by win on 2016-09-29.
 */
public class Reader extends Thread {
    Share share;

    public Reader(Share share){
        this.share = share;
    }

    public  void run() {
        System.out.println(share.getTodayNew());
    }
}
