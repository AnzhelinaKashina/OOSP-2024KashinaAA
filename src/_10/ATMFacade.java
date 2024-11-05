package _10;

public class ATMFacade {
    private ATM atm;

    public ATMFacade(Account account) {
        this.atm = new ATM(account);
    }

    public void deposit(double amount) {
        atm.deposit(amount);
    }

    public boolean withdraw(double amount) {
        return atm.withdraw(amount);
    }

    public void displayBalance() {
        System.out.println("Текущий баланс: " + atm.checkBalance());
    }
}
