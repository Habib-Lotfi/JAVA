
public class App {
    public static void main(String[] args) throws Exception {

        // BankAccount bankAccount1 = new BankAccount();
        // instead of assigning a empty bankAccount constructor then use the 1)
        // initAccount,
        // we applied the proper constructor!
        TimeManager timeManager = new TimeManager();

        BankAccount bankAccount1 = new BankAccount(1L, "Alice", 50000F, AccountType.Deposit);
        BankAccount bankAccount2 = new BankAccount();

        // bankAccount1.name = "Alice";
        // bankAccount1.balance = 50000F;
        // bankAccount1.accountNumber = 1L;

        // 1) bankAccount1.initAccount(1L, "Alice", 50000F);

        bankAccount2.initAccount(2L, "Bob", 30000F, AccountType.Cheque);

        bankAccount1.deposit(1500F);// deposit method is OK!
        bankAccount1.printAccount();// printAccount method is OK!

        bankAccount1.withdraw(250000F);// withdraw method is OK!
        bankAccount1.printAccount();

        // bankAccount2.name = "Bob";
        // bankAccount2.balance = 30000F;
        // bankAccount2.accountNumber = 2L;

        // to transfer some money from orjinal account to destination bank account.
        bankAccount1.transfer(bankAccount2, 350000F);// transfer method is OK!

        bankAccount1.printAccount();
        bankAccount2.printAccount();

        // Applying geter and setter
        float totalMoney = bankAccount1.getBalance() + bankAccount2.getBalance();
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Total money in the Bank is: $" + totalMoney);

        System.out.println("####Total Number of Accounts is: " + BankAccount.getTotalAccountNumber());

        timeManager.printAllTimeInfo();

        BankAccount.printWelcomeMessage();

        InterestOfAccounts interestOfAccount = new InterestOfAccounts(1L, "Joy", 150000F, 5.5F,
                "2020-01-15 10:00");
        System.out.println("your benefit is: $" + interestOfAccount.benefitOfDailyDepositAccount());

        interestOfAccount.printAccount();
        // Applying accessing to a override method in child classes from a ABSTRACT
        // parent.
        bankAccount1.changePassword();

        // Wrong! We can not make a instance of Accounts class (from its CONTRACTOR)as a
        // ABSTRACT class.
        // Accounts childAccounts = new Accounts(3333L,"James");???
        // we can make an instance of its child class (ABSTRACTION)

        // DOWNCASTING to parent class
        //Be careful!!! Downcasting throw exception, SOMETIMES!
        Accounts chillAccount = bankAccount1;

        chillAccount.changePassword();
        chillAccount.display();

        StudentAccount studentAccount = new StudentAccount("Daniel", 112233L, 2021);
        studentAccount.display();

        // UPCASTING to child class!!!
        // In UPCASTING mode parent instance does not access to all child methods in the
        // class!
        // Only it has access to OVERRIDE child methods!
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        Accounts childAccounts = studentAccount;
        childAccounts.display();// it will use 'display method' from child class (StudentAccount class)

    }

}
