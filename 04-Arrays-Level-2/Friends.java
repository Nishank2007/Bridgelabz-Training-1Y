import java.util.Scanner;
class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=3;
        String names[] = new String[n];
        int age[] = new int[n];
        double height[] = new double[n];
        for (int i = 0; i < n; i++) {
			System.out.println("Enter name of "+(i+1)  + " friend is:");
			names[i]=sc.next();
            System.out.println("Enter age of " + names[i] + ":");
            age[i] = sc.nextInt();

            System.out.println("Enter height of " + names[i] + " (in cm):");
            height[i] = sc.nextDouble();
        }
        int youngest = 0;
        int tallest = 0;
        for (int i = 1; i < n; i++) {
            if (age[i] < age[youngest]) {
                youngest = i;
            }
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }
        System.out.println("Youngest Friend is: "+ names[youngest] +
                           " (Age: " + age[youngest] + ")");
        System.out.println("Tallest Friend: " + names[tallest] +
                           " (Height: " + height[tallest] + " cm)");
    }
}