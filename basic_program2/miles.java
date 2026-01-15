import java.util.Scanner;
class miles
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter kilometer:");
		int km = sc.nextInt();
		double mile = km*1.6;
		System.out.println("kilometer to miles is: "+mile);
	}
}