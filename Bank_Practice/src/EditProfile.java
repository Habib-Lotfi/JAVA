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

        String newName = System.console().readLine();
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
    }

}
