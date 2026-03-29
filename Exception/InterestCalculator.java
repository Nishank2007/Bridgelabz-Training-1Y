package out.gla.Exception;
public class InterestCalculator {
    static void calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        // manually throwing exception
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException(
                    "Invalid input: Amount and rate must be positive");
        }
    }
}