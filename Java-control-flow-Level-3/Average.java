import java.util.*;
class Average{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks of physics: ");
		double a =sc.nextInt();
		System.out.print("Enter the marks of chemistry: ");
		double b =sc.nextInt();
		System.out.print("Enter the marks of maths: ");
		double c =sc.nextInt();
		double avg=(a+b+c)/3;
	    System.out.println("Average is: "+avg);
		if(avg>=80 && avg<=100){
			System.out.println("Grade = A");
			System.out.println("Remarks = Level 4,above agency -normalised standards");
		}
		else if(avg>=70 && avg<80){
			System.out.println("Grade = B");
			System.out.println("Remarks = Level 3,at agency -normalised standards");
		}
		else if(avg>=60 && avg<70){
			System.out.println("Grade = C");
			System.out.println("Remarks = Level 2,below,but approaching agency -normalised standards");
		}
		else if(avg>=50 && avg<60){
			System.out.println("Grade = D");
			System.out.println("Remarks = Level 1,well below agency -normalised standards");
		}
        else if(avg>=40 && avg<50){
			System.out.println("Grade = E");
			System.out.println("Remarks = Level 1-,too below agency -normalised standards");
		}
		else if(avg>=1 && avg<40){
			System.out.println("Grade = E");
			System.out.println("Remarks = Remedial Standards");
		}
		else{
		    System.out.println("Invalid!");
		}
	}
}
		