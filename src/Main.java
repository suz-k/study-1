public class Main {
    public static void main(String[] args) {
        Share share = new Share();

        Reader reader1 = new Reader(share);
        reader1.start();
        Reader reader2 = new Reader(share);
        reader2.start();

        try {
            Thread.sleep(5000);
        }catch (Exception e){}

        Writer writer1 = new Writer(share);
        writer1.start();

        try {
            Thread.sleep(5000);
        }catch (Exception e){}

        Writer writer2 = new Writer(share);
        writer2.start();

//        try {
//            reader1.join();
//            reader2.join();
//            writer1.join();
//            writer2.join();
//        }catch (Exception e){};
        // leesg test2~
    }
}