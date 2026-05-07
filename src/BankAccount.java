public class BankAccount {
    private String ownerName;
    private String accountNumber;
    private double balance;
    private int transactionCount;

    public BankAccount(String ownerName, String accountNumber, double initialBalance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Invalid initial balance. Balance set to 0.");
        }

        this.transactionCount = 0;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            transactionCount++;
            System.out.println("Deposit successful: " + amount + " EUR");
        } else {
            System.out.println("Deposit failed. Amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed. Amount must be greater than 0.");
        } else if (amount > balance) {
            System.out.println("Withdrawal failed. Not enough balance.");
        } else {
            balance = balance - amount;
            transactionCount++;
            System.out.println("Withdrawal successful: " + amount + " EUR");
        }
    }

    public void printAccountInfo() {
        System.out.println("----------------------");
        System.out.println("Owner: " + ownerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Balance: %.2f EUR%n", balance);
        System.out.println("Successful Transactions: " + transactionCount);
    }
}
