package out.gla.Inheritance.HierarchicalInheritance;

public class FDAccount extends BankAccount {
    private int tenureMonths;

    public FDAccount(int accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenureMonths + " months");
    }
}