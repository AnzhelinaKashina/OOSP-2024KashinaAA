package _10;

public class ATM {
    private Transaction transaction;

    public ATM(Account account) {
        this.transaction = new Transaction(account);
    }

    public void deposit(double amount) {
        transaction.deposit(amount);
    }

    public boolean withdraw(double amount) {
        return transaction.withdraw(amount);
    }

    public double checkBalance() {
        return transaction.checkBalance();
    }
}
