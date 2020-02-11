package src;

public class Contacts {

    private String firstName;   // firstName is a data member.
    private String lastName;    // lastName is a data member.
    private String phoneNumber; // phoneNumber is a data member

    public Contacts(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + "Phone number: " + this.phoneNumber;
    }

}