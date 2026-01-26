import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("enter a:");
		int a=input.nextInt();
		System.out.print("enter b:");
		int b=input.nextInt();
		int sum=a+b;
		int diff=a-b;
        int mul=a*b;
		int div=a/b;
		System.out.println("the addition is: " + sum + " the difference is: " + diff + "the multiplication is: " + mul + "the division is: " + div);
	}
}