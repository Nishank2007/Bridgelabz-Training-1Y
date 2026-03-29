package out.gla.Exception;

public class Division {
    static void divide(int a, int b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }
}
