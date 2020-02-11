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

/**
 * One object of this class stores a list of persons' contact
 **/
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


    /**
     * Prompt user to input First Name, Last Name, Email, Address, Phone Number
     * and Notes. Read the values and store the values into the contact list.
     **/
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


    /**
     * This method prints out the contacts inside the list
     **/
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

//        public static void searchLastName () {
//            System.out.println("3. Retrieve contacts by searching last name. ");
//            System.out.print(" Last Name: ");
//            Scanner myScanner = new Scanner(System.in);
//            String lastName = myScanner.nextLine().toLowerCase();
//
//            System.out.println("-----------------------------");
//            System.out.println("Redirecting to the Main Menu");
//        }
//    }
//    public static void searchLastName() {
//        System.out.println("3. Retrieve contacts by searching last name. ");
//        System.out.print(" Last Name: ");
//        Scanner myScanner = new Scanner(System.in);
//        String lastName = myScanner.nextLine();
//        Path ContactsPath = Paths.get("data", "contacts.txt");
//        List<String> Personlist = null;
//
//        try {
//            Personlist = Files.readAllLines(ContactsPath);
//            for (String Contacts : Personlist) {
//                if (lastName.toLowerCase().contains(lastName.toLowerCase())) {
//                    System.out.println("Contact:\n" + lastName);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("This contact does not exist");
//        }
//
////        for (Contacts contact : Personlist) {
////            if (lastName.equals(contact.getLastName())) {
////                System.out.println(contact);
////            } else {
////                System.out.println("There are no last name matches in the contact list");
////
////            }
////        }
//        System.out.println("-----------------------------");
//        System.out.println("Redirecting to the Main Menu");
//    }
    static void searchLastName() throws IOException {
        System.out.println("Please enter the name you would like to search for: ");
        Scanner kb = new Scanner(System.in);
        String name = kb.nextLine();

        List<String> Personlist = Files.readAllLines(Paths.get("data", "contacts.txt"));
        for (String contact : Personlist) {
            if (contact.equals(name)) {
                System.out.println(Personlist);
            }
        }
    }

    /**
     * Saves the existing contact list to a .txt file on the hard drive,
     * then prints a confirmation and a farewell message.
     */
    public static void exit() {
        for (Contacts contact : Personlist) {
        }
        System.out.println("------------------");
        System.out.println("Program Terminated, Saved to disk");
        System.out.println("------------------");
    }
}
