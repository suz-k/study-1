import java.util.Scanner;

/**
 * Created by win on 2016-10-13.
 */
public class Main1 {
    public static void main(String[] args) {
        Object obj = new Object();
        Share1 share1 = new Share1(obj);
        share1.setIsWriter(true);

        Share1 share2 = new Share1(obj);
        share2.setIsWriter(false);

        share2.start(); //출력

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        share1.start(); //셋팅
    }
}
