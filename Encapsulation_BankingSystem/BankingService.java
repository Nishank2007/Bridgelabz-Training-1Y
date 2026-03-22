package out.gla.Encapsulation_BankingSystem;
import java.util.List;

public class BankingService {

    public static void processAccounts(List<BankAccount> accounts) {

        for (int i = 0; i < accounts.size(); i++) {

            BankAccount acc = accounts.get(i);

            double interest = acc.calculateInterest();

            System.out.println("Account: " + acc.getAccountNumber());
            System.out.println("Holder: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("Interest: " + interest);

            if (acc instanceof Loan) {
                Loan loanAcc = (Loan) acc;
                System.out.println("Eligible for Loan: " + loanAcc.calculateLoanEligibility());
            }

            System.out.println("----------------------------");
        }
    }
}
