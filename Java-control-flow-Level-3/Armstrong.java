import java.util.*;
class Armstrong{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int number =sc.nextInt();
		int sum=0;
		int originalNumber= number;
		while(originalNumber!=0){
			int digit= originalNumber%10;
			int cube= digit*digit*digit;
		    sum= sum+(cube);
			originalNumber= originalNumber/10;
		}
		if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
	}
}