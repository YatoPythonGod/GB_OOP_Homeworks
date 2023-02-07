package Task_6.Transfer;


import Task_6.Core.Contact;
import Task_6.Core.PhoneBookModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class JSONimport implements Importer {

    private PhoneBookModel book;

    public JSONimport(PhoneBookModel book) {
        this.book = book;
    }


    @Override
    public boolean importFrom(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] temp_list = line.replaceAll("\\[", "").replaceAll("]", "").replaceAll(" ", "").replace("{", "").split("}");

                for (String el : temp_list) {
                    String[] temp = el.replaceAll("\"", "").replaceAll(" ", "").split(",");
                    String contact_name = null;
                    ArrayList<String> contactPhoneNumbers = new ArrayList<>();
                    ArrayList<String> contactEmails = new ArrayList<>();

                    for (String word : temp) {
                        temp = word.split(":");
                        if (temp[0].equals("name")) contact_name = temp[1];
                        if (temp[0].equals("phoneNumbers")) {
                            if (temp[1].contains(",")) {
                                String[] phoneList = temp[1].split(",");
                                Arrays.stream(phoneList).iterator().forEachRemaining(contactPhoneNumbers::add);
                            } else contactPhoneNumbers.add(temp[1]);
                        }
                        if (temp[0].equals("emails")) {
                            if (temp[1].contains(",")) {
                                String[] emailList = temp[1].split(",");
                                Arrays.stream(emailList).iterator().forEachRemaining(contactEmails::add);
                            } else contactEmails.add(temp[1]);
                        }
                    }

                    Contact contact = new Contact(contact_name, contactPhoneNumbers.get(0), contactEmails.get(0));
                    contact.setPhoneNumbers(contactPhoneNumbers);
                    contact.setEmails(contactEmails);
                    book.addContact(contact);

                }
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
