package BankAccountSimulation;
public class PremiumUser extends BankAccount implements Runnable {

    public PremiumUser(String name) {
        super(name, "Premium");
    }

    @Override
    public void run() {
        checkBalance();
    }

    private void checkBalance() {
    }
}