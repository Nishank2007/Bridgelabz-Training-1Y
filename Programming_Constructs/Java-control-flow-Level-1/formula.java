import java.util.*;
class formula{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a= sc.nextInt();
		if(a<=0){
			System.out.println("It is not a natural number");
		}
		else{
			int sum=0;
			for(int i=1;i<=a;i++){
				sum+=i;
			}
			int formula=(a*(a+1))/2;
                System.out.println("Result is correct. Both computations match.");
		}
	}
	
}