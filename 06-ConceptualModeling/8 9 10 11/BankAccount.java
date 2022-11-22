public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String accountHolderSurname;
    private double balance = 0.0;
    private static double withdrawLimit = 500.0;

    public BankAccount(String accountNumber, String accountHolderName, String accountHolderSurname) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountHolderSurname = accountHolderSurname;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderSurname() {
        return accountHolderSurname;
    }

    public void setAccountHolderSurname(String accountHolderSurname) {
        this.accountHolderSurname = accountHolderSurname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > withdrawLimit) {
            throw new IllegalArgumentException("Amount exceeds withdraw limit");
        } else if (amount > balance) {
            throw new IllegalArgumentException("Amount exceeds balance");
        } else {
            balance -= amount;
        }
    }

    public String toString() {
        return "Account number: " + accountNumber + "\nAccount holder: " + accountHolderName + " " + accountHolderSurname + "\nBalance: " + balance;
    }

    public static void setWithdrawLimit(double withdrawLimit) {
        BankAccount.withdrawLimit = withdrawLimit;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(
            "12 3456 7890 1234 5678 9012 3456",
            "John",
            "Doe"
        );
        System.out.println(bankAccount);
        bankAccount.deposit(800.0);
        System.out.println("\n" + bankAccount);
        bankAccount.withdraw(500.0);
        System.out.println("\n" + bankAccount);
        // bankAccount.withdraw(501.0); // throws IllegalArgumentException (amount exceeds withdraw limit)
        // bankAccount.withdraw(400.0); // throws IllegalArgumentException (amount exceeds balance)
    }
}
