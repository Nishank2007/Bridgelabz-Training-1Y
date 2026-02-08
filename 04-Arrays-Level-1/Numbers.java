import java.util.*;
class Numbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter the number:- ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				if(arr[i]%2==0){
					System.out.println(arr[i]+" is positive with even no.");
				}
				else{
					System.out.println(arr[i]+" is positive with odd no.");
				}
			}
			else if(arr[i]==0){
				System.out.println(arr[i]+" is Zero.");
			}
			else{
				System.out.println(arr[i]+" is Negative Number.");
			}
		}
		if(arr[0]>arr.length-1){
			System.out.println(arr[0]+" is Greater Number.");
		}
		else if(arr[0]<arr.length-1){
			System.out.println(arr[0]+" is Lesser Number.");
		}
		else{
			System.out.println("Both are equal.");
		}
	}
}