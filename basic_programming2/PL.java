import java.util.Scanner;
class PL
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cost price:");
		int cp = sc.nextInt();
		System.out.println("enter selling price:");
		int sp = sc.nextInt();
		int profit = sp-cp;
		int profit_percentage = (profit*100)/cp;
		System.out.println("profit is: "+profit);
		System.out.println("profit percentage is: "+profit_percentage+"%");
	}
}