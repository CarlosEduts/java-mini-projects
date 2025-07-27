package projects.bank_account;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String deposit(double value) {
        if (value < 0) {
            return "O valor do saque deve ser positivo.";
        }
        this.balance += value;
        return "Deposito de " + value + " feito na conta " +
                this.ownerName +
                " com sucesso! \nSaldo atual: " +
                this.balance;
    }

    public String withdraw(double value) {
        if (value > this.balance) {
            return "Valor do saque maior que o valor em conta.";
        }

        this.balance -= value;
        return "Saque de " + value + " feito na conta " +
                this.ownerName +
                " com sucesso! \nSaldo atual: " +
                this.balance;
    }

    public double getBalance() {
        return this.balance;
    }
}
