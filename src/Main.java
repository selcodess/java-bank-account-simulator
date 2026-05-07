public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Mazhar", "ACC001", 100);
        BankAccount account2 = new BankAccount("Fuat", "ACC002", 50);

        System.out.println("BANK ACCOUNT SIMULATOR");
        System.out.println("======================");

        account1.printAccountInfo();
        account1.deposit(75);
        account1.withdraw(30);
        account1.withdraw(500);
        account1.printAccountInfo();

        account2.printAccountInfo();
        account2.deposit(-20);
        account2.withdraw(20);
        account2.printAccountInfo();
    }
}
