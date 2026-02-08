import java.util.*;
class Bonus{
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		int n=10;
		//Arrays to store salary and yrs of service
		double salary[] = new double [n];
		double years[]= new double[n];
		// array to store  new salary and bonus amount
		double new_salary[] = new double [n];
		double bonus[]= new double[n];
		double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
		for(int i=0;i<n;i++){
			System.out.println("enter details of employee:"+(i+1));
			System.out.print("enter salary:");
			salary[i]= sc.nextDouble();
			System.out.print("enter years of service:");
			years[i]= sc.nextDouble();
			if(salary[i]<=0 || years[i]<=0){
				System.out.println("invalid input plz enter valid number:");
			    i--;
				continue;
			}
		}
		for(int i=0;i<n;i++){
			if(years[i]>5){
				bonus[i]= salary[i]*0.05;
			}
			else {
				bonus[i]= salary[i]*0.02;
			}
			 new_salary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += new_salary[i];
		}
		for(int i=0;i<n;i++){
		    System.out.println("Total bonus of employee "+(i+1) +" is:- "+ bonus[i]);
		    System.out.println("Old salary is:- "+ salary[i]+" Rupees");
		    System.out.println("New Salary is:- "+ new_salary[i]+" Rupees");
		}
	}
}