import java.util.Scanner;

public class Q7_SmallestLargestFinder{
    public static int[] findSL(int num1, int num2, int num3){
        int largest = num1;
        int smallest = num1;
        if(num2<smallest){ smallest = num2;}
        if(num3<smallest){ smallest = num3;}
        if(num2>largest){ largest = num2;}
        if(num3>largest){ largest = num3; }
        return new int[]{largest,smallest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter num1 is ");
        int num1=sc.nextInt();
        System.out.println("enter num2 is ");
        int num2 =sc.nextInt();
        System.out.println("entre nun3 is ");
        int num3 = sc.nextInt();
        int [] result =findSL(num1, num2, num3);
        System.out.println("Smallest number is: " + result[0]);
        System.out.println("Largest number is: " + result[1]);

        sc.close();
    

    }
}