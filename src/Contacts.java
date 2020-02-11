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

    /**
     * Sets the value of firstName to "newFirstName".
     **/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the value of lastName to "newLastName".
     **/
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the value of phoneNumber to "newPhoneNumber".
     **/
    public void setphoneNumber(String PhoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Return the value of firstName.
     **/
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the value of lastName.
     **/
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the value of phoneNumber.
     **/
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString() {
        return this.firstName + " " + this.lastName + "Phone number: " + this.phoneNumber;
    }

}