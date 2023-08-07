
public class BankTest {
    public static void main(String[] args) {
        // Create 3 bank accounts
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and
        // display the balance each time
        // - each deposit should increase the amount of totalMoney

        account1.deposit(1000.0, "Checking".toLowerCase());
        account2.deposit(2000.0, "Savings".toLowerCase());
        account3.deposit(3000.0, "Checking".toLowerCase());

        account1.getBalance();
        account2.getBalance();
        account3.getBalance();
        System.out.println("Total Money: " + BankAccount.getTotalMoney());

        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account
        // and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        account1.withdraw(1000.0, "Checking".toLowerCase());
        account2.withdraw(2000.0, "Savings".toLowerCase());
        account3.withdraw(3000.0, "Checking".toLowerCase());

        account1.getBalance();
        account2.getBalance();
        account3.getBalance();
        System.out.println("Total Money: " + BankAccount.getTotalMoney());

        // Static Test (print the number of bank accounts and the totalMoney)
        System.out.println("Number of Bank Accounts: " + BankAccount.numOfAccounts());
                System.out.println("Total Money: " + BankAccount.getTotalMoney());
    }
}