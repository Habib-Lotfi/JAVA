
// import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

// Date Format Operations
public class TimeManager {

    private long year;
    private long month;
    private long day;
    private long yearPeriod;
    private long monthPeriod;
    private long dayPeriod;
    private ZoneId zoneIdNewYork = ZoneId.of("America/New_York");
    private LocalDate startDate = LocalDate.parse("2021-11-13");
    private LocalDate currentDate = LocalDate.now(zoneIdNewYork);
    private LocalTime dayTime = LocalTime.now(zoneIdNewYork);
    private boolean dateInfoFlag = false;

    // Printing Currenrt Time
    public void printCurrentTime() {
        long hour = dayTime.getHour();
        long min = dayTime.getMinute();
        long sec = dayTime.getSecond();
        String amPm = hour < 12 ? "AM" : "PM";

        // Adjust hour for 12-hour clock format
        hour = hour % 12;
        if (hour == 0)
            hour = 12; // Adjust 0 o'clock as 12 o'clock
        if (!dateInfoFlag) {
            System.out.println("\n################################");
        }
        System.out.println("Current Time is Hour: " + hour + ", Min: " + min + ", Sec: " + sec);
        System.out.println("Current Time is: " + hour + ":" + min + ":" + sec + "  " + amPm);
        dateInfoFlag = false;
    }

    // Printing Total Hours from Beginning (Opening Account Time)
    public void printTotalHoursFromBeginning() {

        ////////////////////////////////////
        // Duration duration = Duration.between(startDate, currentDate);
        // Convert the duration to hours
        // long hours = duration.toHours();
        ////////////////////////////////////
        // LocalDateTime startDateTime = startDate.atStartOfDay();
        // LocalDateTime endDateTime = LocalDateTime.now();

        // long hours = startDateTime.until(endDateTime, ChronoUnit.HOURS);
        ////////////////////////////////////

        // long hours = startDate.atStartOfDay().until(LocalDateTime.now(),
        // ChronoUnit.HOURS);
        ////////////////////////////////////
        long hours = startDate
                .atStartOfDay()
                .until(LocalDateTime
                        .now(ZoneId
                                .of("America/New_York")),
                        ChronoUnit.HOURS);
        System.out.println("Total Hour/s: " + hours);
    }

    // Printing Current Date Information
    public void dateInfo() {
        System.out.println("\n################################");
        System.out.println("Today is: " + currentDate);
        dateInfoFlag = true;
        printCurrentTime();
    }

    // Printing Date of Opening Account
    public void openingAccountDateInfo() {
        year = startDate.getYear();
        month = startDate.getMonthValue();
        day = startDate.getDayOfMonth();
        System.out.println("Date of Opening Account is: " + year + "-" + month + "-" + day);
        // System.out.println(year + "-" + month + "-" + day);
    }

    // Printing Complete Period Time (Year-Month-Day) from Opening day till Now
    // (Current date)
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
        printTotalHoursFromBeginning();
    }

}