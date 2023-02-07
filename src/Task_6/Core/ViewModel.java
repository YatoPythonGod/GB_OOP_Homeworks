package Task_6.Core;

public interface ViewModel {
    void mainMenu();

    void updateContactMenu();

    void importExportMenu();

    int getChoice();

    int getChoice(String custom);

    String getContactName();

    String getContactName(String custom);

    String getPhoneNumber();

    String getEmail();

    void showContact(Contact contact);

    void showBook(PhoneBookModel book);

    void print(String information);

    void bye();


}
