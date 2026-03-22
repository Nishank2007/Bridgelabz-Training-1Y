package out.gla.Encapsulation_BankingSystem;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SB101", "Rahul", 15000));
        accounts.add(new CurrentAccount("CA102", "Priya", 8000));

        BankingService.processAccounts(accounts);
    }
}
