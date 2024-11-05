package _10;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Счет пополнен на: " + amount + ". Новый баланс: " + balance);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Снято: " + amount + ". Остаток на счете: " + balance);
            return true;
        } else {
            System.out.println("Недостаточно средств для снятия: " + amount);
            return false;
        }
    }
}
