package BankAccountSimulation;
public class BasicUser extends BankAccount implements Runnable {

    public BasicUser(String name) {
        super(name, "Basic");
    }

    @Override
    public void run() {
        checkBalance();
    }

    private void checkBalance() {
    }
}