package out.gla.Encapsulation_BankingSystem;
public class SavingsAccount extends BankAccount implements Loan {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for Savings Account: " + amount);
        } else {
            System.out.println("Loan rejected for Savings Account");
        }
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}