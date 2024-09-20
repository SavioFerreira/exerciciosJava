package account;

import exceptions.InactiveAccountException;
import exceptions.InsufficientBalanceException;

import java.util.Objects;

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

    public void withdraw(double value) {
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
    }

    public void deposit(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0");
        }
        if (isInactive()) {
            throw new InactiveAccountException("Inactive account");
        }
        this.balance += valor;
    }

    public void transfer(CheckingAccount destinationAccount, double value) {
        Objects.requireNonNull(destinationAccount);
        if (destinationAccount.isInactive()) {
            throw new InactiveAccountException("Target account is inactive");
        }
        withdraw(value);
        destinationAccount.deposit(value);
    }
}