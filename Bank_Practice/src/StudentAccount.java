public class StudentAccount extends Accounts implements EditAccount {
    private int entryYear;

    public StudentAccount() {
    }

    // Assume that the student account = studentId
    public StudentAccount(String name, long studentId, int entryYear) {
        super(name, studentId);
        this.entryYear = entryYear;
    }

    // entryYear is an 'int' value but it converts to an 'Integer' value
    // automatically!(inbuilt cascading)
    public Integer getEntryYear() {
        return this.entryYear;
    }

    public void setEntryYear(int entryYear) {
        this.entryYear = entryYear;
    }

    @Override
    public void display() {
        System.out.println("Student name: " + getName());
        System.out.println("Student account number: " + getAccountNumber());
        System.out.println("Student entry year: " + entryYear);
        System.out.println("Account password: " + getPassword());

    }

    @Override
    public void changePassword() {
        // we can have a simple password rules for the student account
        setPassword(passwordMaker());
    }

    @Override
    public void changeToNewName(String newName) {
        setName(newName);
    }

    @Override
    public String getCurrentName() {
        return getName();
    }

}
