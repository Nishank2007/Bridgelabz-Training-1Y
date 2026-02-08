import java.util.*;
class Vote{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of Students:- ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter age of 10 Students:- ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(i<0){
				System.out.println("Invalid Age!");
			}
			else if(i<18){
				System.out.println("The student with the age "+arr[i]+" cannot vote.");
			}
			else{
				System.out.println("The student with the age "+arr[i]+" can vote.");
			}
		}
	}
}
