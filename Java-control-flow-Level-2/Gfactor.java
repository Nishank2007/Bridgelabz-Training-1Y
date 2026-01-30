import java.util.Scanner;
class Gfactor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
		int gfactor=1;
			for(int i=n;i>=1;i--){
				if(n%i==0){
					gfactor=i;
					break;
				}
			}
			System.out.println("Greatest Factor of " + n + " are:"+gfactor);
		
	}
}