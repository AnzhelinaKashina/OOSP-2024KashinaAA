package _10;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000.0);
        ATMFacade atmFacade = new ATMFacade(account);

        atmFacade.displayBalance();
        atmFacade.deposit(500.0);

        atmFacade.withdraw(200.0);

        atmFacade.displayBalance();

        atmFacade.withdraw(2000.0);
    }
}
