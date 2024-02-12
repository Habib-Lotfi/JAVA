import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

// Date Format Operations
public class TimeManager {

    long year;
    long month;
    long day;
    long yearPeriod;
    long monthPeriod;
    long dayPeriod;
    LocalDate startDate = LocalDate.parse("2021-11-13");
    LocalDate currentDate = LocalDate.now();

    // Printing Current Date Information
    public void dateInfo() {
        System.out.println("\n################################");
        System.out.println("Today is: " + currentDate);
    }

    // Printing Date of Opening Account
    public void openingAccountDateInfo() {
        year = startDate.getYear();
        month = startDate.getMonthValue();
        day = startDate.getDayOfMonth();
        System.out.println("Date of Opening Account is: " + year + "-" + month + "-" + day);
        // System.out.println(year + "-" + month + "-" + day);
    }

    // Printing Complete Period Time from Opening day till Now (Current date)
    public void completePeriodTime() {
        Period period = Period.between(startDate, currentDate);
        // System.out.println("##############################");
        System.out.println("Complete Period of Opening Account is: " + "Years: " + period.getYears() + " / Months: "
                + period.getMonths() + " / Days: " + period.getDays());
    }

    // Printing Period Time According to Years, Months and Days
    public void individualYYMMDD() {
        yearPeriod = startDate.until(currentDate, ChronoUnit.YEARS);
        monthPeriod = startDate.until(currentDate, ChronoUnit.MONTHS);
        dayPeriod = startDate.until(currentDate, ChronoUnit.DAYS);
        System.out
                .println("Total Year/s: " + yearPeriod + "\nTotal Month/s: " + monthPeriod + "\nTotal Day/s: "
                        + dayPeriod);
    }

    public void printAllTimeInfo() {
        dateInfo();
        openingAccountDateInfo();
        completePeriodTime();
        individualYYMMDD();
    }

}