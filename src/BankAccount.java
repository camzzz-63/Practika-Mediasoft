//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.time.LocalDateTime;

public class BankAccount {
    private String ownerName;
    private int balance;
    private LocalDateTime openingDate;
    private boolean isBlocked;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0;
        this.openingDate = LocalDateTime.now();
        this.isBlocked = false;
    }

    public boolean deposit(int amount) {
        if (amount > 0 && !this.isBlocked) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(int amount) {
        if (amount > 0 && amount <= this.balance && !this.isBlocked) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(BankAccount otherAccount, int amount) {
        if (otherAccount != null && !this.isBlocked && !otherAccount.isBlocked && amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            otherAccount.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public int getBalance() {
        return this.balance;
    }

    public LocalDateTime getOpeningDate() {
        return this.openingDate;
    }

    public boolean isBlocked() {
        return this.isBlocked;
    }

    public void setBlocked(boolean blocked) {
        this.isBlocked = blocked;
    }
}
