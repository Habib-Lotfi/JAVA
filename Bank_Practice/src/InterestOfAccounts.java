import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class InterestOfAccounts extends BankAccount {
    private float accountInterest;
    private float dayPercentOfInterest = 4.00f; // Bank Policy: percentage of INTEREST
    private float monthPercentOfInterest = 5.50f; // Bank Policy: percentage of INTEREST
    private int monthPolicy = 6; // Bank Policy: number of the months to calculate INTEREST of considered account
    private int dayPolicy = 90; // Bank Policy: number of the days to calculate INTEREST of considered account
    private float interestReduction = 10.00f;// Bank Policy: percentage of INTEREST will be reduced
    private long monthPeriod;
    private long dayPeriod;
    private LocalDateTime openingAccountDate;
    private DateTimeFormatter stringToLocalDateFormatter;
    private LocalDateTime currentDate = LocalDateTime.now();

    public InterestOfAccounts() {

    }

    public InterestOfAccounts(long accountNumber, String name, float balance, float percentOfInterest,
            String openingAccountDate) {
        super(accountNumber, name, balance, AccountType.Deposit);
        stringToLocalDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        // this.percentOfInterest = percentOfInterest;
        this.openingAccountDate = LocalDateTime.parse(openingAccountDate, stringToLocalDateFormatter);
    }

    private void calculatinDurationofMonths() {
        dayPeriod = openingAccountDate.until(currentDate, ChronoUnit.DAYS);
        monthPeriod = openingAccountDate.until(currentDate, ChronoUnit.MONTHS);
    }

    public float benefitOfDailyDepositAccount() {
        // *** balance is a 'protected' variable: so we can use it here (in child
        // classes)
        if (dayPeriod >= (long) dayPolicy) {

            // the day period of account meet the requirement of Bank Policy Day/s so 100%
            // of INTEREST is calculating
            accountInterest = (dayPeriod * balance) * dayPercentOfInterest / 100;

        } else {
            // By default REDUCTION INTEREST is calculating because of Bank Policy Day/s
            float newPercentOfInterest = dayPercentOfInterest - (dayPercentOfInterest * interestReduction / 100);//
            accountInterest = dayPeriod * newPercentOfInterest / 100 * balance;

        }

        System.out.println("\n#############################");
        System.out.println("Total day:" + dayPeriod);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        return accountInterest;
    }

    public float benefitOfMonthlyDepositAccount() {

        // *** balance is a 'protected' variable: so we can use it here (in child
        // classes)
        if (monthPeriod >= (long) monthPolicy) {

            // the day period of account meet the requirement of Bank Policy Month/s so 100%
            // of INTEREST is calculating
            accountInterest = (monthPolicy * balance) * monthPercentOfInterest / 100;

        } else {
            // By default REDUCTION INTEREST is calculating because of Bank Policy Month/s
            float newPercentOfInterest = monthPercentOfInterest - (monthPercentOfInterest * interestReduction / 100);//
            accountInterest = monthPeriod * newPercentOfInterest / 100 * balance;

        }

        System.out.println("\n#############################");
        System.out.println("Total Months:" + monthPeriod);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        return accountInterest;
    }
}
