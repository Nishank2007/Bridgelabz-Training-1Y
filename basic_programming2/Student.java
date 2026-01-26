import java.util.Scanner;
class Student{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of pens:");
		int pen = sc.nextInt();
		System.out.print("enter no. of Student:");
		int student = sc.nextInt();
		int q = pen/student;
		int rem = pen%student;
		System.out.println("Quotient is: "+q);
		System.out.println("Remainder is: "+rem);
	}
}
