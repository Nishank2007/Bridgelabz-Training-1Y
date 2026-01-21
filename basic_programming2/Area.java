import java.util.Scanner;
class Area{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter base:");
		int b=input.nextInt();
		System.out.println("enter height:");
		int h=input.nextInt();
		double area_sq_cm=0.5*b*h;
		double area_sq_in = area_sq_cm / 6.4516;
		System.out.println("The Area of the triangle in sq in is "+ area_sq_in + " and sq cm is " + area_sq_cm);
	}
}