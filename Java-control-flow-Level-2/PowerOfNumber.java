import java.util.Scanner;
class PowerOfNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a=sc.nextInt();
		System.out.print("Enter power: ");
		int b=sc.nextInt();
		if(a<=0 || b<0){
			System.out.print("Invalid Integer!");
		}
		else{
			int result=1;
			int counter=1;
			while(counter<=b){
				result=result*a;
				counter++;
			}
			System.out.println("Result is: "+result);
		}
	}
}