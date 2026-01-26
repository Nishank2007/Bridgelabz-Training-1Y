import java.util.*;
class Counter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter a counter no. :");
        int a = sc.nextInt();
        while(a>=1){
			System.out.println(a);
			a--;
		}
    }
}