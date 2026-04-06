package SmartHomeAutomation;
public class TemperatureSensor extends Thread {

    public TemperatureSensor() {
        setName("Temperature Sensor");
        setPriority(7);
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " reading temperature | Cycle: " + i + " | Time: " + java.time.LocalTime.now());

                Thread.sleep(5000); // 5 sec
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}