import java.util.Scanner;
class Unit_price
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("enter unit price:");
		int unitprice=input.nextInt();
	    System.out.println("enter quantity:");
		int quantity=input.nextInt();
		int total_price = unitprice * quantity;
		System.out.println("The total purchase price is INR "+ total_price);
	}
}