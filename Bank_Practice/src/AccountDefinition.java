public class AccountDefinition {
    private String[] accountTypeDefinition = new String[AccountType.values().length];

    public AccountDefinition() {
        // Initialize array elements in a constructor CONSIDERING SIZE OF ACCOUNT TYPE
        // ENUM!!!
        accountTypeDefinition[0] = "ShortInterest has a GOOD benefit fot customer.";
        accountTypeDefinition[1] = "LongInterest has a BETTER benefit fot customer. ";
        accountTypeDefinition[2] = "FixedInterest has the BEST benefit fot customer.";
        accountTypeDefinition[3] = "Deposit is a good way to keep your money safe.";
        accountTypeDefinition[4] = "Cheque is a way to use CHEQUE Facility.";
        accountTypeDefinition[5] = "Business is a HELP to keep your business safe.";

    }

    public String[] getAccountTypeDefinition() {
        return this.accountTypeDefinition;
    }

    public void setAccountTypeDefinition(String[] accountTypeDefinition) {
        this.accountTypeDefinition = accountTypeDefinition;
    }
}