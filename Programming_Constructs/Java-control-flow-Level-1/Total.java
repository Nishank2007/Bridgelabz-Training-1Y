import java.util.Scanner;
class Total{
	 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double total=0.0;
		double num;
		System.out.print("Enter a number:");
        num = sc.nextDouble();
		while(true){
			
			System.out.print("Enter a number (0 to stop): ");
            num = sc.nextDouble();
		
		if(num<=0){
			break;
		}
		total= total+num;
		}
		System.out.println("Total sum = " + total);
	 }
}