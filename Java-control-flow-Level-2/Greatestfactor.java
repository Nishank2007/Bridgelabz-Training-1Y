import java.util.Scanner;
class Greatestfactor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
		int gfactor=1;
        if (n <= 0){
            System.out.println("not positive integer.");
        } 
		else{
            System.out.println("Greatest Factor of " + n + " are:");
			int counter=n;
			while(counter>=1){
				if(n%counter==0){
					gfactor=counter;
					break;
				}
				counter--;
			}
			System.out.println(gfactor);
		}
	}
}