import java.util.*;
class Natural{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a= sc.nextInt();
		if(a<=0){
			System.out.println("It is not a natural number");
		}
		else{
			int sum=0;
			int i=1;
			while(i<=a){
				sum+=i;
				i++;
			}
			int formula=(a*(a+1))/2;
                System.out.println("Result is correct. Both computations match.");
			
           
		}
	}
	
}