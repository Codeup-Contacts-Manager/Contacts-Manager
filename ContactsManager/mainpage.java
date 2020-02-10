package ContactsManager;

public class mainpage extends Getnames{

    public mainpage(String name, String number) {
        super(name, number);
    }

    public void mainDisplay() {
        System.out.println("1. View contacts\n" +
                "2. Add a new contact\n" +
                "3. Search a contact by name\n" +
                "4. Delete an existing contact\n" +
                "5. Exit\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
    }

}
