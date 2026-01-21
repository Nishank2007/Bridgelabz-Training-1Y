import java .util.Scanner;
class Sam
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter maths marks:");
		int Math = sc.nextInt();
		System.out.println("enter physics marks:");
		int Phy = sc.nextInt();
		System.out.println("enter chem marks:");
		int Chem = sc.nextInt();
		int avg = (Math+Phy+Chem)/3;
		System.out.println("Sam's marks in PCM is: "+avg);
	}
}