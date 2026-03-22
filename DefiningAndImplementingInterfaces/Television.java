package out.gla.DefiningAndImplementingInterfaces;
public class Television implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("TV is now ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is now OFF");
    }
}
