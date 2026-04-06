package SmartHomeAutomation;
public class DoorLockMonitor extends Thread {
    public DoorLockMonitor() {
        setName("Door Lock Monitor");
        setPriority(5);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " checking locks | Cycle: " + i + " | Time: " + java.time.LocalTime.now());

                Thread.sleep(6000); // 6 sec
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}