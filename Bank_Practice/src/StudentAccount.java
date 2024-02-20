public class StudentAccount extends Accounts {
    private int entryYear;

    public StudentAccount() {
    }

    // Assume that the student account = studentId
    public StudentAccount(String name, long studentId, int entryYear) {
        super(name, studentId);
        this.entryYear = entryYear;
    }

    public int getEntryYear() {
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

}
