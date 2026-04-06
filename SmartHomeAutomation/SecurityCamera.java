package SmartHomeAutomation;
public class SecurityCamera extends Thread {
    public SecurityCamera() {
        setName("Security Camera");
        setPriority(10);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " recording video | Cycle: " + i + " | Time: " + java.time.LocalTime.now());

                Thread.sleep(3000); // 3 sec
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}