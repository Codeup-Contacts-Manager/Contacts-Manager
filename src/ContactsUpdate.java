package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ContactsUpdate {
    public static List<Contacts> Personlist = new ArrayList<>();

    /**
     * Basic UI for the program which prompts users to choose one of the four options provided
     **/
    public static int mainMenu() {
        System.out.println("-----------------------------");
        System.out.println("What do you want to do?");
        System.out.println("  1. View contacts");
        System.out.println("  2. Add a new contact");
        System.out.println("  3. Search a contact by name and/or phone number.");
        System.out.println("  4. Delete an existing contact.");
        System.out.println("  5. Exit");
        System.out.print("\nEnter an option (1, 2, 3, 4 or 5): ");

        Scanner myScanner = new Scanner(System.in);
        int userChoice = myScanner.nextInt();
        System.out.println("-----------------------------");
        return userChoice;
    }

    //    This works fine
    public static void addPerson() throws IOException {
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" 1. Add a New Person ");
        System.out.print("  First Name: ");
        String firstName = myScanner.nextLine();
        System.out.print("  Last Name : ");
        String lastName = myScanner.nextLine();
        System.out.print("  Phone Number : ");
        String phoneNumber = myScanner.nextLine();
        Files.write(
                Paths.get("data", "contacts.txt"),
                Arrays.asList(firstName + " " + lastName + " " + phoneNumber),
                StandardOpenOption.APPEND
        );
        Personlist.add(new Contacts(firstName, lastName, phoneNumber));
        System.out.println(firstName + " " + lastName + " has been successfully added to the contact list! ");
    }

    //    This works fine
    public static void printList() {
        System.out.println("Print the list of contacts. ");
        Path ContactsPath = Paths.get("data", "contacts.txt");
        List<String> Personlist = null;
        try {
            Personlist = Files.readAllLines(ContactsPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < Personlist.size(); i += 1) {
            System.out.println((i + 1) + ": " + Personlist.get(i));

        }
    }


    /**
     * This method retrieve the individual(s) contact info. from the list by
     * searching last name
     **/

    public static void searchLastName() {
        System.out.println("3. Retrieve contacts contact by name and/or phone number. ");
        System.out.print(" Name or Number: ");
        Scanner myScanner = new Scanner(System.in);
        String searchedLastName = myScanner.nextLine();
        Path ContactsPath = Paths.get("data", "contacts.txt");
        List<String> Personlist;
        try {
            Personlist = Files.readAllLines(ContactsPath);
            for (String person : Personlist) {
                if (person.toLowerCase().contains(searchedLastName.toLowerCase())) {
                    System.out.println("Contact:\n" + person);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("This contact does not exist");
        }
        System.out.println("-----------------------------");
        System.out.println("Redirecting to the Main Menu");
    }

    public static void exit() {
        System.out.println("Goodbye");
        System.out.println("------------------");
    }

    public static void deleteContact() {

    }
}
