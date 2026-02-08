import java.util.*;
class DigitFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = num;
        int i = 0;
        while (temp > 0) {
            digits[i] = temp % 10;
            temp /= 10;
            i++;
        }
        int[] freq = new int[10];
        for (i = 0; i < digits.length; i++) {
            freq[digits[i]]++;
        }
        System.out.println("Digit Frequency:");
        for (i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }
    }
}
