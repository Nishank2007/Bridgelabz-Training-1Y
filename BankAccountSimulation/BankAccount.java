package BankAccountSimulation;

public class BankAccount implements Runnable {
    private String accountHolder;
    private String accountType;

    public BankAccount(String accountHolder, String accountType) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " (" + accountType + ") "+ "is checking balance | Priority: " + Thread.currentThread().getPriority() + " | Attempt: " + i);

                Thread.sleep(2000); // 2 sec delay
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}