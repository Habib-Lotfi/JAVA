public class App {
    public static void main(String[] args) throws Exception {

        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        
        bankAccount1.name = "Alice";
        bankAccount1.balance = 50000F;
        bankAccount1.accountNumber = 1L;

        bankAccount1.deposit(1500F);// deposit method is OK!
        bankAccount1.printAccount();// printAccount method is OK!

        bankAccount1.withdraw(2500F);// withdraw method is OK!
        bankAccount1.printAccount();

        bankAccount2.name = "Bob";
        bankAccount2.balance = 30000F;
        bankAccount2.accountNumber = 2L;
        bankAccount1.transfer(bankAccount2, 3500F);// transfer method is OK!

        bankAccount1.printAccount();
        bankAccount2.printAccount();

       
    }
}
