import java.util.Scanner;
class backward{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		if(n<=0 || n>100){
			System.out.println("Not a valid integer!");
		}
		else{
		    System.out.println("All the numbers which perfectly divides the given number:");
			for(int i=100;i>=1;i--){
				if(n%i==0){
					System.out.println(i);
				}
			}
		}
	}
}