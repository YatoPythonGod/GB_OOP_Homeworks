package Task_6.Core;

import java.util.Scanner;

public class ViewConsole implements ViewModel {
    Scanner scanner;

    public ViewConsole(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mainMenu() {
        System.out.println("""
                Menu:
                1. Show all contacts
                2. Add contact
                3. Delete contact
                4. Find contact
                5. Change contact
                6. Import contact
                7. Export contact
                8. Exit
                """);
    }

    public void updateContactMenu() {
        System.out.println("""
                Change:
                1. Name
                2. Phone number
                3. Email
                """);
    }


    public void importExportMenu() {
        System.out.println("""
                Turn format:
                1. CSV
                2. JSON
                """);
    }

    public int getChoice() {
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public int getChoice(String custom) {
        System.out.printf("Please enter %s: \n", custom);
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public String getContactName() {
        System.out.println("Please enter contact name: ");
        return scanner.nextLine();
    }

    public String getContactName(String custom) {
        System.out.printf("Please enter %s name: \n", custom);
        return scanner.nextLine();
    }

    public String getPhoneNumber() {
        System.out.println("Please enter phone number: ");
        return scanner.nextLine();
    }

    public String getEmail() {
        System.out.println("Please enter contact email: ");
        return scanner.nextLine();
    }

    public void showContact(Contact contact) {
        System.out.println(contact);
    }

    public void showBook(PhoneBookModel book) {
        int count = 1;
        for (Contact contact : book.getBook().values()) {
            System.out.printf("%d. ", count++);
            System.out.println(contact);
            System.out.println();
        }
    }

    public void print(String information) {
        System.out.println(information);
    }

    @Override
    public void bye() {
        System.out.println("See you later!");
        scanner.close();
    }


}
