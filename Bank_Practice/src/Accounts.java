import java.security.SecureRandom;

public abstract class Accounts {
    // protected String name;
    // protected String password;
    // protected long accountNumber;
    private String name;
    private String password;
    private long accountNumber;

    public Accounts() {
    }

    public Accounts(String name, long accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.password = passwordMaker();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String passwordMaker() {
        String passTemplate = "!@#$%^&*()_+-=1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom randomPassword = new SecureRandom();
        String newPass = "";
        int lengthOfPassword = 6;// initial length of random password.
        int randomIntOfPassTemplate;

        for (int i = 0; i < lengthOfPassword; i++) {
            randomIntOfPassTemplate = randomPassword.nextInt(passTemplate.length());
            newPass += passTemplate.charAt(randomIntOfPassTemplate);
        }

        return newPass;
    }

    public abstract void display();// ABSTRACT method

    public abstract void changePassword();// ABSTRACT method
}
