public class EditProfile {
    public void Edit(EditAccount account) {
        System.out.println("Current name is:" + account.getCurrentName());
        System.out.println("Enter your new name: ");
        String newName = System.console().readLine();
        if (newName.length() > 0) {
            account.changeToNewName(newName);
        }
    }

}
