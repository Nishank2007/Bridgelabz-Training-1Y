import java.util.Scanner;
class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int age_Amar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int age_Akbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int age_Anthony = sc.nextInt();
        System.out.print("Enter Amar's height(in cms): ");
        int height_Amar = sc.nextInt();
        System.out.print("Enter Akbar's height(in cms): ");
        int height_Akbar = sc.nextInt();
        System.out.print("Enter Anthony's height(in cms): ");
        int height_Anthony = sc.nextInt();
        if (age_Amar <= age_Akbar && age_Amar <= age_Anthony) {
            System.out.println("Youngest friend is Amar");
        } 
        else if (age_Akbar <= age_Amar && age_Akbar <= age_Anthony) {
            System.out.println("Youngest friend is Akbar");
        } 
        else {
            System.out.println("Youngest friend is Anthony");
        }
        if (height_Amar >= height_Akbar && height_Amar >= height_Anthony) {
            System.out.println("Tallest friend is Amar");
        } 
        else if (height_Akbar >= height_Amar && height_Akbar >= height_Anthony) {
            System.out.println("Tallest friend is Akbar");
        } 
        else {
            System.out.println("Tallest friend is Anthony");
        }
    }
}
