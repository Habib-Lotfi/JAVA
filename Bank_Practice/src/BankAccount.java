
public class BankAccount {
    private long accountNumber;
    private String name;
    private float balance;
    private long minBlance = 0; // minimum required balance for account from Bank policy. By default is 0!

    // Empty Constructor
    public BankAccount() {
    }

    // Constructor
    public BankAccount(long accountNumber, String name, float balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    /////// OverLoading for initAccount Method
    public void initAccount() {
        this.accountNumber = 111L; // Default Account Number!
        this.name = "XXXXXXX";// Default Name of the Account!
        this.balance = 0.0f; // Default Balance for Opening Account!
    }

    public void initAccount(long newAccountNumber, String name, float openingBalance) {
        this.accountNumber = newAccountNumber;
        this.name = name;
        this.balance = openingBalance;
    }

    public void deposit(float amount) {
        balance += amount;
        System.out.println("\nThe amount of : $" + amount);
        System.out.println("is SUCCESSFULLY deposited.");
    }

    public boolean withdraw(float amount) {
        if ((balance - minBlance) >= amount) {
            balance -= amount;
            System.out.println("\nWithdraw successfully completed for of amount: $" + amount);
            return true;
        } else {
            System.out.println("\nError: There is not enough money to withdraw!");
            return false;
        }
    }

    public void transfer(BankAccount desAccount, float amount) {
        if (withdraw(amount)) {
            desAccount.deposit(amount);
            System.out.println("Transfer successfully completed for amount: $" + amount);
            System.out.println("From Bank Account Number: " + accountNumber + " to Bank Account Number: "
                    + desAccount.accountNumber);
        } else {
            System.out.println("Error: Transfer failed!!!");
        }
    }

    public void printAccount() {
        System.out.println("**************************************");
        System.out.println("\nAccount Holder Name: " + name);
        System.out.println("Account Number is: " + accountNumber);
        System.out.println("Total Balance of the account is: $" + balance);
        System.out.println("Current Available Balance of the account is: $" + (balance - minBlance));
    }
}
