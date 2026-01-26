import java.util.Scanner;
class Number{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
	    int b=sc.nextInt();
        int c=sc.nextInt();
        if(a<b && a<c){
			System.out.println("First no. is the smallest no.");
		}			
		else{
			System.out.println("First no. is not the smallest no.");
		}
	}
}