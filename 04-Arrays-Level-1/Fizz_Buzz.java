import java.util.Scanner;
import java.util.Arrays;
class Fizz_Buzz{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of element in an array:- ");
		int n=sc.nextInt();
		if(n<=0){
			System.out.print("Invalid! ");
			return;
		}
		System.out.print("Enter the elements in an array:- ");
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
			if(i%3==0&&i%5==0)
			{
				arr[i]="FizzBuzz";
			}
			else if(i%3==0){
				arr[i]="Fizz";
			}
			else if(i%5==0){
				arr[i]="Buzz";
			}
			else{
				arr[i]=String.valueOf(i);
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}
			