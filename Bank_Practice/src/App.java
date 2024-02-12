public class App {
    public static void main(String[] args) throws Exception {

        // BankAccount bankAccount1 = new BankAccount();
        // instead of assigning a empty bankAccount constructor then use the 1)
        // initAccount,
        // we applied the proper constructor!
        TimeManager timeManager = new TimeManager();

        BankAccount bankAccount1 = new BankAccount(1L, "Alice", 50000F);
        BankAccount bankAccount2 = new BankAccount();

        // bankAccount1.name = "Alice";
        // bankAccount1.balance = 50000F;
        // bankAccount1.accountNumber = 1L;

        // 1) bankAccount1.initAccount(1L, "Alice", 50000F);

        bankAccount2.initAccount(2L, "Bob", 30000F);

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
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("Total money in the Bank is: $" + totalMoney);
        
        timeManager.printAllTimeInfo();
    }
}
