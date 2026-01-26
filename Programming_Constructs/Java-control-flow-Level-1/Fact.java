import java.util.*;
class Fact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        long fact = 1;

        if (a < 0) {
            System.out.println("Factorial not defined!");
        }
        else if (a == 0) {
            System.out.println("Factorial is 1");
        }
        else {
            for(int i=1;i <= a;i++) {
                fact *= i;
            }
            System.out.println("Factorial is " + fact);
        }
    }
}
