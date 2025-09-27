// File1 
class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        assert initialBalance >= 0 : "Initial balance cannot be negative";
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        assert amount > 0 : "Deposit amount must be positive";
        balance += amount;

        // Balance should always remain non-negative
        assert balance >= 0 : "Balance became negative after deposit!";
    }

    public void withdraw(double amount) {
        assert amount > 0 : "Withdrawal amount must be positive";
        assert amount <= balance : "Withdrawal amount exceeds balance!";
        balance -= amount;

        // Balance should always remain non-negative
        assert balance >= 0 : "Balance became negative after withdrawal!";
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
