import java.util.*;
class Odd_Even{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		if(n<=0){
			System.out.print("Error, Please Enter the Natural Number : ");
			return;
		}
		int size=(n/2)+1;
		int even_arr[]=new int[size];
		int odd_arr[]=new int[size];
		int even_index=0;
		int odd_index=0;
		for(int i=0;i<=n;i++){
			if(i%2==0){
				even_arr[even_index]=i;
				even_index++;
			}
			else{
				odd_arr[odd_index]=i;
				odd_index++;
			}
		}
		System.out.println("Odd Numbers:- ");
        for(int i=0;i<odd_index;i++){
			System.out.println(odd_arr[i]+" ");
		}
        System.out.println("Even Numbers:- ");		
		for(int i=0;i<even_index;i++){
			System.out.println(even_arr[i]+" ");
		}
	}
}	