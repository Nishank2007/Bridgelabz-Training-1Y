import java.util.Scanner;
class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 4;
        int[] multiplication = new int[4];
        int index = 0;
        for (int i = 6; i <= 9; i++) {
            multiplication[index] = number * i;
            index++;
        }
        System.out.println("Multiplication Table:");
        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplication[index]);
            index++;
        }
    }
}