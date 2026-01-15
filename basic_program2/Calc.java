import java.util.Scanner;
class Calc{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter num1:");
		int a=input.nextInt();
		System.out.println("enter num2:");
		int b=input.nextInt();
		int sum=a+b;
		int diff=a-b;
        int mul=a*b;
		int div=a/b;
		System.out.println("the addition is: " + sum + " the difference is: " + diff + " the multiplication is: " + mul + " the division is: " + div);
	}
}