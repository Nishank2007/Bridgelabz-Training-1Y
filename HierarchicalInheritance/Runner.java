package out.gla.Inheritance.HierarchicalInheritance;

public class Runner {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(101, 50000, 4.5);
        CheckingAccount c = new CheckingAccount(102, 30000, 10000);
        FDAccount f = new FDAccount(103, 100000, 12);

        s.displayAccountDetails();
        s.displayAccountType();
        System.out.println();

        c.displayAccountDetails();
        c.displayAccountType();
        System.out.println();

        f.displayAccountDetails();
        f.displayAccountType();
    }
}