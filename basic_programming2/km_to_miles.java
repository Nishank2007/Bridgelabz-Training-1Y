import java.util.Scanner;
class km_to_miles{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter distance in km:");
		double km=sc.nextDouble();
		double m= km*1.6;
		System.out.println("The total miles is "+ m + " m " + "for the given " + km +" km");
	}
}