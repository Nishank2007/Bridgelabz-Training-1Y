package SmartHomeAutomation;

public class Runner {
    public static void main(String[] args) {

        TemperatureSensor temp = new TemperatureSensor();
        SecurityCamera cam = new SecurityCamera();
        LightController light = new LightController();
        DoorLockMonitor door = new DoorLockMonitor();

        // Start all threads
        temp.start();
        cam.start();
        light.start();
        door.start();

        // Wait for all to finish
        try {
            temp.join();
            cam.join();
            light.join();
            door.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All devices have completed their cycles. System shutting down.");
    }
}