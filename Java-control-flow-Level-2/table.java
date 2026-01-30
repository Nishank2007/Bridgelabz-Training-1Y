import java.util.*;
class table{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number: ");
        int a=sc.nextInt();
		if(a>5&&a<10){
			for(int i=1;i<=10;i++){
				System.out.println(a+"*"+i+"="+a*i);
			}
		}
		else{
			System.out.println("Invalid");
		}
	}		
}