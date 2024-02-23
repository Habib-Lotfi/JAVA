import java.util.ArrayList;

public class ArrayListClass {

    // In this method number of elements must be determine in the beginning and it
    // is immutable.
    public void staticArrayList() {
        /////////////// Array of Objects//////////////////////
        BankAccount[] bankAccountsArray = new BankAccount[4];
        bankAccountsArray[0] = new BankAccount(1L, "A111", 10000F, AccountType.Deposit);
        bankAccountsArray[1] = new BankAccount(2L, "A222", 20000F, AccountType.Deposit);
        bankAccountsArray[2] = new BankAccount(3L, "A333", 30000F, AccountType.Deposit);
        bankAccountsArray[3] = new BankAccount(4L, "A444", 40000F, AccountType.Deposit);

        /////// JUST FOR ITTTT///////////
        // bankAccountsArray[0].display();
        for (int i = 0; i < 4; i++) {
            bankAccountsArray[i].display();
            System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMM");
        }
    }

    // When number of elements are not specified in the beginning of the
    // usage(coding time).
    public void dynamicArrayList() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Andy");
        arrayList.add("Sara");
        arrayList.add(2, "Gary");
        System.out.println("\nLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
        System.out.println(arrayList);

        arrayList.set(1, "David");
        System.out.println("After Setting: " + arrayList);

        System.out.println("arrayList[2] ::: " + arrayList.get(2));

        arrayList.remove(0);

        System.out.println("After 'remove': " + arrayList);
    }

    // ***Dynamic arrayList of a Class!!!
    public void dynamicArrayListAccount() {

        // Both methods are correct!
        // ArrayList<BankAccount> dynamicList = new ArrayList<BankAccount>();

        ArrayList<BankAccount> dynamicList = new ArrayList<>();
        dynamicList.add(new BankAccount(1L, "Alice", 50000F, AccountType.Deposit));

        System.out.println("\nDDDDDDDDDDDDDDDDD" + dynamicList.size());/// printing the array memory address
        dynamicList.get(0).printAccount();

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
        BankAccount bankAccountTest = new BankAccount();
        bankAccountTest = dynamicList.get(0);
        bankAccountTest.getBalance();

        EditProfile<String> editProfile = new EditProfile<>(bankAccountTest.getName());
        editProfile.Edit(bankAccountTest);
        System.out.println(bankAccountTest.getName());
    }
}
