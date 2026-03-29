package out.gla.Exception;

public class MultipleCatch {
    public static void getValue(int[] arr, int index) throws ArrayIndexOutOfBoundsException, NullPointerException {
        if (arr == null) {
            throw new NullPointerException("Array is not initialized!");
        }
        else if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Invalid index!");
        }
        System.out.println("Value at index " + index + ": " + arr[index]);
    }
}
