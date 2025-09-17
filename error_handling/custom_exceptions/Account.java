package error_handling.custom_exceptions;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double value) throws InsufficientBalanceException {
        if (value > this.balance) {
            throw new InsufficientBalanceException("Saldo insuficiente!");
        }
        this.balance -= value;
    }
}
