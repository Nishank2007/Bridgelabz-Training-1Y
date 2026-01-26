import java.util.Scanner;
class perimeter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter perimeter:");
		int perimeter = sc.nextInt();
		int side = perimeter/4;
		System.out.println("side of Square is: "+side);
	}
}