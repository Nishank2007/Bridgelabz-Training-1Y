package out.gla.FunctionalInterfaces;
import java.util.function.Predicate;
public class TemperatureService {

    private double threshold;

    public TemperatureService(double threshold) {
        this.threshold = threshold;
    }

    public void checkTemperature(double[] readings) {

        Predicate<Double> alertCondition = temp -> temp > threshold;

        for (int i = 0; i < readings.length; i++) {
            if (alertCondition.test(readings[i])) {
                System.out.println("ALERT! Temperature exceeded: " + readings[i]);
            }
        }
    }
}
