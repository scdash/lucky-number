/**
 * Created by scdas on 10/23/2017.
 * Exists in PACKAGE_NAME of LuckyNumber.
 */
public class LuckyNum implements Runnable{
    private String name;

    LuckyNum(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int cnt = 7 + (int)(12 * Math.random());
        for (int i = 0; i < cnt; i++) {
            try {
                int ms = ((int)(0.7 + 0.6 * Math.random()) * 130);
                Thread.sleep(ms);
            } catch (InterruptedException e) {
                System.out.println("Exception thrown : " + e);
            }
            System.out.printf("%-6s: I am still thinking...\n", name);
        }
        int luckyNum = 10 + (int)(30 * Math.random());
        System.out.printf("%-6s: **** My lucky number is %2d ****\n", name, luckyNum);
    }
}
