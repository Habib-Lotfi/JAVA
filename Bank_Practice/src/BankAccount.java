import java.time.LocalDate;

public class BankAccount {
    private static long totalAccountNumber = 0;
    private long accountNumber;
    private String name;
    protected float balance;
    private long minBalance = 0; // minimum required balance for account from Bank policy. By default is 0!
    private AccountType accountType;
    private String[] weekString = new String[EnumDays.values().length];
    private String[] accountTypeString = new String[AccountType.values().length];
    private String tmpDay;
    private EnumDays offDay = EnumDays.SUNDAY;
    private TimeManager timeManager = new TimeManager();
    private LocalDate dateTime;

    // weekString=weekDays.toArray();

    // Applying Overloading on Constructor
    // Empty Constructor
    public BankAccount() {
        totalAccountNumber++;
    }

    // Constructor
    public BankAccount(long accountNumber, String name, float balance, AccountType accountType) {
        totalAccountNumber++;
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.accountType = accountType;
        this.dateTime = timeManager.currentDateInfo();
    }

    public void printingWeekDays() {

        // EnumDays tmp1 = EnumDays.MONDAY;
        // tmpDay = tmp1.toString();
        // Convert enum values to string and assign them to the weekString array
        for (int i = 0; i < EnumDays.values().length; i++) {
            weekString[i] = EnumDays.values()[i].toString();
            // weekString[i] = tmpDay;
        }

        // Print the weekString array to verify
        for (String day : weekString) {
            System.out.println(day);
        }

        System.out.println("Weekend (is offday):" + offDay);
    }

    public static long getTotalAccountNumber() {
        return totalAccountNumber;
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

    public AccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public LocalDate dateTime() {
        return this.dateTime;
    }

    public void setDateTime(LocalDate dateTime) {
        this.dateTime = dateTime;
    }

    /////// OverLoading for initAccount Method
    public void initAccount() {
        totalAccountNumber++;
        this.accountNumber = 111L; // Default Account Number!
        this.name = "XXXXXXX";// Default Name of the Account!
        this.balance = 0.0f; // Default Balance for Opening Account!
    }

    public void initAccount(long newAccountNumber, String name, float openingBalance,
            AccountType accountType) {
        totalAccountNumber++;
        this.accountNumber = newAccountNumber;
        this.name = name;
        this.balance = openingBalance;
        this.accountType = accountType;
    }

    public void deposit(float amount) {
        balance += amount;
        System.out.println("\nThe amount of : $" + amount);
        System.out.println("is SUCCESSFULLY deposited.");
    }

    public boolean withdraw(float amount) {
        if ((balance - minBalance) >= amount) {
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

    // Applying FORMAT String to printing output.
    public void printAvailableAccountTypes() {
        String accountTypeString;
        String accountTypeDefinition;

        // Create an instance of AccountDefinition
        AccountDefinition accountDefinition = new AccountDefinition();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(String.format("%-35s", "   Account Type") + "Account Definition");

        for (int i = 0; i < AccountType.values().length; i++) {

            // Get the string representation of each AccountType enum value
            accountTypeString = AccountType.values()[i].toString();

            // Access the definitions from the instance of AccountDefinition
            accountTypeDefinition = accountDefinition.getAccountTypeDefinition()[i];

            // formatted string: "(index) AccountType: Definition"
            System.out.println(String.format("%d) %-20s: %s", i + 1, accountTypeString, accountTypeDefinition));
        }
    }

    public void printAccount() {
        System.out.println("**************************************");
        System.out.println("\nAccount Holder Name: " + name);
        System.out.println("\nAccount Type: " + accountType);
        System.out.println("Account Number is: " + accountNumber);
        System.out.println("Total Balance of the account is: $" + balance);
        System.out.println("Current Available Balance of the account is: $" + (balance - minBalance));
        printingWeekDays();
        printAvailableAccountTypes();
        System.out.println("\n###Total Account number is: " + totalAccountNumber);
    }

    // Applying the STATIC method to access this instance anywhere without making
    // any instance.
    public static void printWelcomeMessage() {
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(String.format("%-15s", "      ") + "BANK OF BEST BENEFITS");
        System.out.println(String.format("%-15s", "   ") + "Welcome Message");
        System.out.println(String.format("%-35s", "   Mr/Ms") + "Welcome to our bank. ");
        System.out.println(String.format("%-35s", "   Enjoy working with us!") + " ");
    }
}
