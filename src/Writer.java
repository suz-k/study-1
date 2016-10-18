/**
 * Created by win on 2016-09-29.
 */
public class Writer extends Thread {
    Share share;

    public Writer(Share share){
        this.share = share;
    }

    public  void run() {
            share.setTodayNew("안녕");
    }

    public void setShare(String strTodayNew) {
        share.setTodayNew(strTodayNew);
    }
}
