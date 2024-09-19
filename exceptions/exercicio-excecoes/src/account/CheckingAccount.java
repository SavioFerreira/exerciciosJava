package account;

public class CheckingAccount {

    private String number;
    private double balance;
    private boolean active;

    public CheckingAccount(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isInactive() {
        return !isActive();
    }

    public void activate() {
        this.active = true;
    }

    public void disable() {
        this.active = false;
    }

    public boolean withdraw(double value) {
        if (value <= 0) {
            System.out.println("Withdrawal amount must be greater than 0");
            return false;
        }

        if (value > this.balance) {
            System.out.println("Account without balance");
            return false;
        }

        if (isInactive()) {
            System.out.println("Inactive account");
            return false;
        }

        this.balance -= value;
        return true;
    }

    public boolean deposit(double valor) {
        if (valor <= 0) {
            System.out.println("Deposit amount must be greater than 0");
            return false;
        }

        if (isInactive()) {
            System.out.println("Inactive account");
            return false;
        }

        this.balance += valor;
        return true;
    }

    public boolean transfer(CheckingAccount destinationAccount, double value) {
        if (destinationAccount.isInactive()) {
            System.out.println("Target account is inactive");
            return false;
        }

        if (withdraw(value)) {
            destinationAccount.deposit(value);
            return true;
        }

        return false;
    }

}