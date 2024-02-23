import java.util.NoSuchElementException;
import java.util.Scanner;

public class EditProfile<T> {
    T value;

    public EditProfile(T value) {
        this.value = value;
    }

    public void Edit(EditAccount account) {

        // System.out.println("Current name is:" + account.getCurrentName());
        // command above line and modify it for unknown variable types
        System.out.println("(((((((((((Handle All Types Class)))))))))))");
        System.out.println("Current VALUE is:" + this.value);

        // System.out.println("Enter your new name: ");
        System.out.println("Enter your new value!: ");
        // console command may cause some issues while running including mySelf!!!
        // String newName = System.console().readLine();
        Scanner scanner = new Scanner(System.in);
        String newName="";
        // String newName = scanner.nextLine();
        
        try {
            newName = scanner.nextLine();
        } catch (NoSuchElementException e) {
            System.err.println(
                    "Failed to read input. Please run the program in a console that supports interactive input.");
        }

        // we need to implement the correct condition.
        if ((value instanceof String && newName.length() > 0)
                || (value instanceof Integer && newName.matches("\\d*"))) {
            System.out.println(newName.matches("\\d*"));
            account.changeToNewName(newName);
        } else {
            System.out.println("Error in input value!!!");
        }
        // if (newName.length() > 0) {
        // account.changeToNewName(newName);
        // }

        scanner.close(); // Close the scanner

    }

}
