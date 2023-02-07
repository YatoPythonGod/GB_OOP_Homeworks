package Task_6.Core;

import Task_6.Exceptions.BadEmailException;
import Task_6.Exceptions.BadPhoneNumberException;
import Task_6.ValidityCheck.EmailValidityCheck;
import Task_6.ValidityCheck.PhoneNumberValidityCheck;

import java.util.ArrayList;

public class Contact {

    private String name;
    private ArrayList<String> phoneNumbers;
    private ArrayList<String> emails;


    public Contact(String name, String number, String email) throws Exception {
        this.name = name;
        this.phoneNumbers = new ArrayList<String>();
        if (!PhoneNumberValidityCheck.isValidPhoneNumber(number)) throw new BadPhoneNumberException();
        this.phoneNumbers.add(number);
        this.emails = new ArrayList<String>();
        if (!EmailValidityCheck.isValidEmail(email)) throw new BadEmailException();
        this.emails.add(email);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void addPhoneNumber(String number) {
        phoneNumbers.add(number);
    }

    public void addEmail(String email) {
        phoneNumbers.add(email);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nNumbers: %s\nEmails: %s\n", name, phoneNumbers, emails);
    }


}
