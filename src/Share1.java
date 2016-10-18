/**
 * Created by win on 2016-10-13.
 */
public class Share1 extends Thread {
    static String strNews;
    Object objLock;
    boolean isWriter = true;

    Share1(Object obj){
        this.objLock = obj;
    }

    public String getStrNews() {
        return strNews;
    }

    public void setStrNews(String strNews) {
        Share1.strNews = strNews;
    }

//    Share1(String strNews) {
//        Share1.strNews = strNews;
//    }

//    Share1() {
//        ;
//    }

    @Override
    public void run() {
        synchronized (objLock) {
            if (isWriter) {
                setStrNews("오늘의 뉴스");
                    objLock.notifyAll();
            } else {
                while (strNews == null) {
                    try {
                            objLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(getStrNews());
            }
        }
    }

    public void setIsWriter(boolean a){
       isWriter = a;
    }

}
