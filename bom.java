import java.util.Timer;
import java.util.TimerTask;


public class bom {
    public static int beginTime = 11;
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                if (beginTime == 0) {
                    System.out.println("-- LIFT OFF --");
                    timer.cancel();

                } else {
                    beginTime--;
                    System.out.println(beginTime);
                }
            }
        }, 0, 1000);
    }
}

