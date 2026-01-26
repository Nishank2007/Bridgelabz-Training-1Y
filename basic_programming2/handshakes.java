import java.util.Scanner;
class handshakes{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("enter no. of Students:");
		int N=input.nextInt();
		int n=N*2;
		double possible_handshakes=(n*(n-1))/2;
		System.out.println("No. of possible handshakes is: " + possible_handshakes);
	}
}