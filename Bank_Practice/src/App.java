public class App {
    public static void main(String[] args) throws Exception {

        BankAccount bankAccount = new BankAccount();
        bankAccount.name = "Alice";
        bankAccount.balance = 50000L;
        bankAccount.accountNumber = 1L;

        System.out.println(bankAccount.name);
        System.out.println(bankAccount.balance);
        System.out.println(bankAccount.accountNumber);
    }
}
