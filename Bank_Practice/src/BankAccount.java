public class BankAccount {
    long accountNumber;
    String name;
    long balance;
    long minBlance = 0; // minimum required blance for account from Bank policy. By default is 0!

    long getBalance() {
        return this.balance;
    }

    void deposit(long amount) {
        balance += amount;
    }

    boolean withdraw(long amount) {
        if ((balance - minBlance) >= amount) {
            balance -= amount;
            System.out.println("Withdraw successfully completed for amount:" + amount);
            return true;
        } else {
            System.out.println("Error: There is not enough money to withdraw!");
            return false;
        }
    }

    void transfer(BankAccount desAccountNumber, long amount) {
        if (withdraw(amount)) {
            desAccountNumber.deposit(amount);
            System.out.println("Transfer successfully completed for amount:" + amount);
            System.out.println("from Bank account:" + accountNumber + " to Bank account:" + desAccountNumber);
        } else {
            System.out.println("Error: Transfer failed!!!");
        }
    }

    void printAccount() {
        System.out.println("Account Holder Name: " + name);
        
    }
}
