package SmartHomeAutomation;
public class LightController extends Thread {
    public LightController() {
        setName("Light Controller");
        setPriority(5);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " adjusting lights | Cycle: " + i + " | Time: " + java.time.LocalTime.now());

                Thread.sleep(4000); // 4 sec
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}