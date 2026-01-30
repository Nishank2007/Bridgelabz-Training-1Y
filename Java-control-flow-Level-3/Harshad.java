import java.util.*;
class Harshad{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num =sc.nextInt();
		int sum=0;
		while(num!=0){
			int digit = num%10;
			sum = sum+digit;
			num = num / 10;	
		}
		if(num%sum==0){
			System.out.println("Harshad number");
		}
		else{
			System.out.println(" not Harshad number");
		}
	}
}