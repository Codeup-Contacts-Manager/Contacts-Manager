package ContactsManager;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactInterface contactsFromFile = new ContactInterface(scanner);


    }
}
