package src;

import java.io.IOException;

public interface Main {
    static void main(String args[]) throws IOException {

        while (true) {
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
            } else
                System.out.println("Invalid input.");
        }
    }
}