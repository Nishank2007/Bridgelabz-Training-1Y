import java.util.Scanner;
class Loop{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++){
			int m= sc.nextInt();
			if(m<50&&m>=0){
			System.out.println("Fail!");
			}
			else if(m>=50&&m<60){
				System.out.println("D Grade");
			}
			else if(m>=60&&m<70){
				System.out.println("C Grade");
			}
			else if(m>=70&&m<80){
				System.out.println("B Grade");
			}
			else if(m>=80&&m<90){
				System.out.println("A Grade");
			}
			else if(m>=90&&m<=100){
				System.out.println("O Grade");
			}
			else{
				System.out.println("Invalid!");
			}
		}
	}
}