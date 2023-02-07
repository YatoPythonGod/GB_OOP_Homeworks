package Task_6.Transfer;

import Task_6.Core.Contact;
import Task_6.Core.PhoneBookModel;

import java.io.*;

public class CSVexport implements Exporter {

    private PhoneBookModel book;
    private static final String CSV_SEPARATOR = ";";

    public CSVexport(PhoneBookModel book) {
        this.book = book;
    }

    @Override
    public boolean exportTo(String path) throws FileNotFoundException {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            for (Contact contact : book.getBook().values()) {
                StringBuilder oneLine = new StringBuilder();
                oneLine.append(contact.getName());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(String.join(", ", contact.getPhoneNumbers()));
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(String.join(", ", contact.getEmails()));
                oneLine.append(CSV_SEPARATOR);
                bw.write(oneLine.toString());
                bw.newLine();
            }
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
