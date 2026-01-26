import java.util.Scanner;
class Num{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a no.: ");
        int n=sc.nextInt();
		if(n>0){
			System.out.println("The no. is Positive");
		}
		else if(n<0){
			System.out.println("The no. is Negative");
		}
		else{
			System.out.println("The no. is Zero");
		}
	}
}