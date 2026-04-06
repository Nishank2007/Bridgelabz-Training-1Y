package BankAccountSimulation;
public class RegularUser extends BankAccount implements Runnable {

    public RegularUser(String name) {
        super(name, "Regular");
    }

    @Override
    public void run() {
        checkBalance();
    }

    private void checkBalance() {
    }
}