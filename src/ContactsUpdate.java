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
        System.out.println("  3. Search a specific person on the contact list by last name");
        System.out.println("  5. Exit");
        System.out.println();
        System.out.print("Input: ");

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
                Arrays.asList(firstName, lastName, phoneNumber),
                StandardOpenOption.APPEND
        );
        Personlist.add(new Contacts(firstName, lastName, phoneNumber));
        System.out.println(Personlist);
        System.out.println("has been successfully added to the contact list! ");
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
     * //         * @param person
     **/


    public static void searchLastName() {
        System.out.println("3. Retrieve contacts by searching last name. ");
        System.out.print(" Last Name: ");
        Scanner myScanner = new Scanner(System.in);
        String searchedLastName = myScanner.nextLine();
        Path ContactsPath = Paths.get("data", "contacts.txt");
        List<String> Personlist;
        try {
            Personlist = Files.readAllLines(ContactsPath);
            for (int i = 0; i < Personlist.size(); i += 1) {
                if (searchedLastName.equals(Personlist.get(i))) {
                    System.out.println("Contact:\n" + Personlist.toString());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("This contact does not exist");
        }

//        }
        System.out.println("-----------------------------");
        System.out.println("Redirecting to the Main Menu");
    }
//    static void searchLastName() throws IOException {
//        System.out.println("Please enter the name you would like to search for: ");
//        Scanner Search = new Scanner(System.in);
//        String name = Search.nextLine();
//        List<String> Personlist = Files.readAllLines(Paths.get("data", "contacts.txt"));
//        for (String contact : Personlist) {
//            if (contact.equals(name)) {
//                System.out.println(Personlist);
//            }
//        }
//    }

    /**
     * Saves the existing contact list to a .txt file on the hard drive,
     * then prints a confirmation and a farewell message.
     */
    public static void exit() {
        System.out.println("Goodbye");
        System.out.println("------------------");
    }
}
