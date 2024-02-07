public class BankAccount {
    long accountNumber;
    String name;
    float balance;
    long minBlance = 0; // minimum required blance for account from Bank policy. By default is 0!

    float getBalance() {
        return this.balance;
    }

    void deposit(float amount) {
        balance += amount;
        System.out.println("\nThe amount of : $" + amount);
        System.out.println("is SUCCESSFULLY deposited.");
    }

    boolean withdraw(float amount) {
        if ((balance - minBlance) >= amount) {
            balance -= amount;
            System.out.println("\nWithdraw successfully completed for of amount: $" + amount);
            return true;
        } else {
            System.out.println("\nError: There is not enough money to withdraw!");
            return false;
        }
    }

    void transfer(BankAccount desAccount, float amount) {
        if (withdraw(amount)) {
            desAccount.deposit(amount);
            System.out.println("Transfer successfully completed for amount: $" + amount);
            System.out.println("From Bank Account Number: " + accountNumber + " to Bank Account Number: "
                    + desAccount.accountNumber);
        } else {
            System.out.println("Error: Transfer failed!!!");
        }
    }

    void printAccount() {
        System.out.println("\nAccount Holder Name: " + name);
        System.out.println("Account Number is: " + accountNumber);
        System.out.println("Current Balance of the account is: $" + balance);
    }
}
