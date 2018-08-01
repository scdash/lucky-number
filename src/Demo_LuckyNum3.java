/**
 * Created by scdas on 10/23/2017.
 * Exists in PACKAGE_NAME of LuckyNumber.
 */
public class Demo_LuckyNum3 {
    public static void main(String[] args) {
        System.out.printf("=======START=======\n");
        LuckyNum lucky1 = new LuckyNum("Emily");
        LuckyNum lucky2 = new LuckyNum("Tim");
        LuckyNum lucky3 = new LuckyNum("Ann");
        Thread thread1 = new Thread(lucky1);
        Thread thread2 = new Thread(lucky2);
        Thread thread3 = new Thread(lucky3);
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Exception thrown : " + e);
        }
        System.out.printf("=======DONE=======");
    }
}
