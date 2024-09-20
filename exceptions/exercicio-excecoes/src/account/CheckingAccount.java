package account;

import exceptions.InactiveAccountException;
import exceptions.InsufficientBalanceException;

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

    public boolean withdraw(double value) throws Exception {

            if (value <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be greater than 0");
            }
            if (value > this.balance) {
                throw new InsufficientBalanceException("Account without balance");
            }

            if (isInactive()) {
                throw new InactiveAccountException("Inactive account");
            }

            this.balance -= value;
            return true;
    }

    public boolean deposit(double valor) throws Exception {
        if (valor <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0");
        }

        if (isInactive()) {
            throw new InactiveAccountException("Inactive account");
        }

        this.balance += valor;
        return true;
    }

    public boolean transfer(CheckingAccount destinationAccount, double value) throws Exception {
        if (destinationAccount.isInactive()) {
            throw new InactiveAccountException("Target account is inactive");
        }

        if (withdraw(value)) {
            destinationAccount.deposit(value);
            return true;
        }

        return false;
    }

}