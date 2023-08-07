import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber; // Ninja Bonus 1

    private static int accounts = 0;
    private static double totalMoney = 0.0; // refers to the sum of all bank account checking and savings balances

    // CONSTRUCTOR

    BankAccount() {
        this.checkingBalance = 0.0;
        this.savingsBalance = 0.0;
        this.accountNumber = generateAccountNumber();
        accounts++;
        System.out.println("New account Created. Account number: " + this.accountNumber);
    }

    BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        accounts++;
        System.out.println("New account Created. Account number: " + this.accountNumber);
    }

    // ninja bonus 2
    private static String generateAccountNumber() {
        Random rand = new Random();
        String accountNum = "";
        for (int i = 0; i < 10; i++) {
            accountNum += rand.nextInt(10);
        }
        return accountNum;
    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public static int getAccounts() {
        return accounts;
    }

    public static double getTotalMoney() {
        return totalMoney;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public static int numOfAccounts() {
        return accounts;
    }

    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings
    // account
    public void deposit(double amount, String accountType) {
        if (accountType.equals("checking")) {
            this.checkingBalance += amount;
        } else if (accountType.equals("savings")) {
            this.savingsBalance += amount;
        }
        totalMoney += amount;
        System.out.println("Deposited " + amount + " into " + accountType + " account");
        System.out.println("Your new account balance is " + this.checkingBalance + " and " + this.savingsBalance);
    }

    // withdraw
    // - users should be able to withdraw money from their checking or savings
    // account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdraw(double amount, String accountType) {
        if (accountType.equals("checking") && amount <= this.checkingBalance) {
            this.checkingBalance -= amount;
            totalMoney -= amount;
        } else if (accountType.equals("savings") && amount <= this.savingsBalance) {
            this.savingsBalance -= amount;
            totalMoney -= amount;
        } else {
            System.out.println("Insufficient funds or incorrect account type");
        }

    }

    // getBalance
    // - display total balance for checking and savings of a particular bank account
    public void getBalance() {
        System.out.println("Checking balance is " + this.checkingBalance);
        System.out.println("Savings balance is " + this.savingsBalance);
    }

}