
// Demo.java
public class Demo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Akshat", 7000);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(2000);
        System.out.println("After deposit, Balance: " + account.getBalance());

        account.withdraw(1000);
        System.out.println("After withdrawal, Balance: " + account.getBalance());

        // assertion error
        account.withdraw(50000); // Withdrawal exceeds balance
        account.deposit(-500);   // Invalid deposit
    }
}