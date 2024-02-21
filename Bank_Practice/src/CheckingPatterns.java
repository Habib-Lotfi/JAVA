import java.util.regex.Pattern;

public class CheckingPatterns {
    // Default pattern
    private String pattern = "Welcome to best BANK";

    // Converting to String to Array
    private char[] characters = pattern.toCharArray();

    Integer numInteger = 333221212;
    String tmpString = "001234444";

    public void display() {
        // changing pattern in some places
        characters[3] = 'X';

        // String newString = new String(characters); == or below line:
        String newString = String.valueOf(characters);

        // newString[3] = "W"; Incorrect operation! In java STRING are immutable!

        // String numString = numInteger.toString(); == or below line:
        String numString = String.valueOf(numInteger);

        // we can determine the base of the number
        int numInt = Integer.parseInt(tmpString, 16);

        System.out.println("\n+++++++++++++  Checking Pattern  +++++++++++");
        System.out.println("\npattern = " + pattern);
        System.out.println("pattern[3] = " + pattern.charAt(3));
        System.out.println("\nAfter modification:::: " + newString);
        System.out.println("\nnumber in string from Integer :: " + numString);
        System.out.println("\n(int) number in Integer from String:: " + numInt);

    }

    // Regular Expression Pattern
    // https://www.tutorialspoint.com/java/java_regular_expressions.htm
    public void patternMatchChecking() {
        String numString = String.valueOf(numInteger);
        // boolean pattern = Pattern.matches(numString, numString);
        boolean pattern = Pattern.matches("\\d*", numString);
        System.out.println("\n*******************************");
        System.out.println("Is pattern matching??? ::: " + pattern);
        if (pattern) {
            System.out.println("\nHere is the pattern: " + numString);
        } else {
            System.out.println("\nWrong pattern. Do it again!");
        }
    }

    // Generic method <T>
    public static <T> void printArray(T[] genericArray) {
        System.out.println("\n///////////Generic method\\\\\\\\\\\\\\\\");
        // It is printing the array references ! we have to convert it to a string.
        // System.out.println(genericArray);

        for (int i = 0; i < genericArray.length; i++) {
            System.out.print(genericArray[i]);
        }
        for (int i = 0; i < genericArray.length; i++) {
            System.out.print("\n" + genericArray[i]);
        }
    }
}
