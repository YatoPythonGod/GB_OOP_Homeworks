package Task_5.Transfer;

import Task_5.Core.Contact;
import Task_5.Core.PhoneBookModel;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONexport implements Exporter {

    private PhoneBookModel book;
    private ArrayList<PhoneBookModel> contact_list;

    public JSONexport(PhoneBookModel book) {
        this.book = book;
        contact_list = new ArrayList<PhoneBookModel>();

    }

    @Override
    public boolean exportTo(String path) throws FileNotFoundException {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            StringBuilder oneLine = new StringBuilder();
            oneLine.append("[");
            for (Contact contact : book.getBook().values()) {
                oneLine.append("{\"name\": ");
                oneLine.append("\"" + contact.getName() + "\"");
                oneLine.append(", \"phoneNumbers\": ");
                ArrayList<String> temp = contact.getPhoneNumbers();
                temp.forEach(el -> oneLine.append(String.format("\"%s\", ", el)));
                oneLine.delete(oneLine.length() - 2, oneLine.length() - 1);
                oneLine.append(", \"emails\": ");
                temp = contact.getEmails();
                temp.forEach(el -> oneLine.append(String.format("\"%s\", ", el)));
                oneLine.delete(oneLine.length() - 2, oneLine.length() - 1);
                oneLine.append("}, ");
            }
            oneLine.delete(oneLine.length() - 2, oneLine.length() - 1);
            oneLine.append("]");
            bw.write(oneLine.toString());
            bw.flush();
            bw.close();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
