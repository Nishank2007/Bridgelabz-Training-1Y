import java.util.Scanner;
class bward{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n<=0 || n>=100){
			System.out.println("Not a valid integer!");
		}
		else{
			int counter=n;
			while(counter>=1){
				if(n%counter==0){
					System.out.print(counter+" ");
				}
				counter--;
			}
		}
	}
}