import java.util.Scanner;
class AOT{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter base:");
		int b=input.nextInt();
		System.out.println("enter height:");
		int h=input.nextInt();
		double area=0.5*b*h;
		
		System.out.println(area);
		
	}
}