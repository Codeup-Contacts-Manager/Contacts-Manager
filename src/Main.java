package src;

import java.io.IOException;
import java.util.ArrayList;

/**
 * A contact list program that stores users' information into the list
 **/
public interface Main {
    public static void main(String args[]) throws IOException {

        int runVariable = 0;

        while (runVariable == 0) {
            int userChoice = ContactsUpdate.mainMenu();
            if (userChoice == 1)
                ContactsUpdate.printList();
            else if (userChoice == 2)
                ContactsUpdate.addPerson();
            else if (userChoice == 3)
                ContactsUpdate.searchLastName();
            else if (userChoice == 4) {
                ContactsUpdate.deleteContact();
            } else if (userChoice == 5) {
                ContactsUpdate.exit();
                runVariable = 1;
            } else
                System.out.println("Invalid input.");
        }
    }
}
