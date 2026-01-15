import java.util.Scanner;
class Distance_yards{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("enter distance in feets:");
		int feet=input.nextInt();
		double yards=feet/3;
		double miles=yards/1760;
		System.out.println("The distance in yards is " + yards + " while the distance in miles is "+ miles);
	}
}