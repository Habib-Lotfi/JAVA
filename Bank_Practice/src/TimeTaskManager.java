import java.util.TimerTask;

public class TimeTaskManager extends TimerTask {
    private int i;

    @Override
    public void run() {
        System.out.println("\n++++++++++++Timer Task++++++++++++++");
        while (i < 10) {
            System.out.println((i + 1) + ") Timer testing...");
            i++;
        }
    }

}
