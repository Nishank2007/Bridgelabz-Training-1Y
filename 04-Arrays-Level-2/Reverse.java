import java.util.*;
class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = num % 10;
            num /= 10;
        }
        System.out.print("Reversed number in array form: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
