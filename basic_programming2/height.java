import java.util.Scanner;
class height{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("enter height in cm:");
		int h=input.nextInt();
		double foot=h*12*2.54;
		double inch=h*2.54;
		System.out.println("Your Height in feet is "+ foot + " and inches is " + inch);
	}
}