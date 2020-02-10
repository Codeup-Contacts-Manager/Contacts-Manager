package src;

import java.util.Scanner;

/** A contact list program that stores users' information into the list**/
public interface Main {
        public static void main(String args[]) {
                        List contact = new List();
                contact.mainMenu();
            Scanner scanner = new Scanner(System.in);
                String choice = scanner.nextLine();

                switch(choice) {
                    case "1":
                        contact.printList();
                        break;
                    case "2":
                        contact.addPerson ();
                        break;
                    case "3":
                        contact.searchLastName();
                        break;
                    default:
                        contact.exit();
                        return;
                }
            }
                        
//                        int runVariable = 0;
//
//            contact.runMenu();
//            while (runVariable == 0) {
//                    int userChoice = contact.mainMenu();
//
//                    if (userChoice == 1)
//                            contact.addPerson();
//                    else if (userChoice == 2)
//                                    contact.printList();
//                    else if (userChoice == 3)
//                            contact.searchLastName();
//                    else if (userChoice == 4) {
//                            contact.exit();
//                            runVariable = 1;
//                    }
//                    else
//                            System.out.println("Invalid input.");
//                }
        }
