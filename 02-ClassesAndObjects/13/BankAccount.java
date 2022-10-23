import java.util.ArrayList;

public class BankAccount {
    
    // Attributes
    String number;
    double balance;
    String name;
    String holder;
    ArrayList<String> transactions = new ArrayList<String>();

    public void deposit(double amount) {
        String transactionDescription = "Deposit of $" + amount;
        transactions.add(transactionDescription);
        balance += amount;
        System.out.println(transactionDescription + " successful\n");
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough funds to withdraw $" + amount + ", only $" + balance + " available\n");
            transactions.add("Transaction denied: attempted withdrawal of $" + amount);
            return;
        }

        String transactionDescription = "Withdrawal of $" + amount;
        transactions.add(transactionDescription);
        balance -= amount;
        System.out.println(transactionDescription + " successful\n");
    }

    public void displayInfo() {
        System.out.println(
            "[ Account details ]" +
            "\nName: " + name +
            "\nHolder: " + holder +
            "\nNumber: " + number +
            "\nBalance: " + balance +
            "\nTransactions: "
        );
        for (String transaction : transactions) {
            System.out.println(" - " + transaction);
        }
        System.out.println();
    }

    // Methods
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount();
        
        account.name = "Checking";
        account.holder = "John Doe";
        account.number = "00 0000 0000 0000 0000";
        account.balance = 0.0;

        account.deposit(100.0);
        account.withdraw(50.0);
        account.withdraw(100.0);
        account.deposit(1000.0);
        account.displayInfo();
    }
}