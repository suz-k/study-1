/**
 * Created by win on 2016-09-29.
 */
public class Share {
    public String todayNews;
    boolean isTodayNews = false;

    public synchronized void setTodayNew(String news){
        todayNews = news;
        isTodayNews = true;

        notifyAll();
    }

    public synchronized String  getTodayNew(){
        while(isTodayNews == false) {
            try {
                wait();
            }catch (Exception e){}
        }
        isTodayNews = false;
        return todayNews;
    }

    public String updateTodayNew(){
        while (isTodayNews == false) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        todayNews = todayNews + "수정됨|";
        isTodayNews = false;
        return todayNews;
    }
}
