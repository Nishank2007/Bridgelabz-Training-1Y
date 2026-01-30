import java.util.Scanner;
class University{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fee:");
		int fee = sc.nextInt();
		System.out.println("enter discount percent:");
		int dp = sc.nextInt();
		double da = (dp*fee)/100;
		double finalfee = fee-da;
		System.out.println("The discount amount is INR "+ da+" and final discounted fee is INR "+ finalfee);
	}
}