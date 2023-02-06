package Task_5.Core;

import Task_5.Transfer.CSVexport;
import Task_5.Transfer.CSVimport;
import Task_5.Transfer.JSONexport;
import Task_5.Transfer.JSONimport;

public class PresenterPhoneBook {
    private PhoneBookModel book;

    public ViewModel viewModel;

    public PresenterPhoneBook(ViewModel viewModel, PhoneBookModel book) {
        this.viewModel = viewModel;
        this.book = book;
    }

    private void updateContact() throws Exception {
        String temp_name = viewModel.getContactName();
        while (book.searchContact(temp_name) == null) {
            viewModel.showBook(book);
            temp_name = viewModel.getContactName();
        }
        viewModel.updateContactMenu();
        switch (viewModel.getChoice()) {
            case 1 -> {
                book.updateContactName(temp_name, viewModel.getContactName("new"));
                viewModel.print("Done!");
                this.mainMenu();
            }
            case 2 -> {
                int count_phones = 1;
                for (String phone : book.searchContact(temp_name).getPhoneNumbers()) {
                    System.out.printf("%d. %s\n", count_phones++, phone);
                }
                book.updatePhoneNumber(temp_name, viewModel.getChoice("which number do you want to change"), viewModel.getPhoneNumber());
                viewModel.print("Done!");
                this.mainMenu();
            }
            case 3 -> {
                int count_emails = 1;
                for (String phone : book.searchContact(temp_name).getPhoneNumbers()) {
                    System.out.printf("%d. %s", count_emails++, phone);
                }
                book.updateEmails(temp_name, viewModel.getChoice("which email do you want to change:"), viewModel.getEmail());
                viewModel.print("Done!");
                this.mainMenu();
            }
            default -> {
                viewModel.print("Incorrect input");
                this.updateContact();
            }
        }
    }

    public void mainMenu() throws Exception {
        int user_choice = 0;
        while (user_choice != 8) {
            viewModel.mainMenu();
            user_choice = viewModel.getChoice("number");
            switch (user_choice) {
                case 1 -> viewModel.showBook(book);
                case 2 ->
                        book.addContact(new Contact(viewModel.getContactName(), viewModel.getPhoneNumber(), viewModel.getEmail()));
                case 3 -> {
                    if (book.deleteContact(viewModel.getContactName())){
                        viewModel.print("Done!");
                        this.mainMenu();
                    } else {viewModel.print("Contact not found!");
                        this.mainMenu();
                    }

                }
                case 4 -> viewModel.showContact(book.searchContact(viewModel.getContactName()));
                case 5 -> this.updateContact();
                case 6 -> {viewModel.importExportMenu();
                    switch (viewModel.getChoice()){
                        case 1 -> new CSVimport(book).importFrom(System.getProperty("user.dir")+"\\src\\Task_5\\" + viewModel.getContactName("file"));
                        case 2 -> new JSONimport(book).importFrom(System.getProperty("user.dir")+"\\src\\Task_5\\" + viewModel.getContactName("file"));
                        default -> {viewModel.print("Incorrect input");
                            this.mainMenu();}
                    }
                }
                case 7 -> {viewModel.importExportMenu();
                    switch (viewModel.getChoice()){
                        case 1 -> new CSVexport(book).exportTo(System.getProperty("user.dir")+"\\src\\Task_5\\Export.csv");
                        case 2 -> new JSONexport(book).exportTo(System.getProperty("user.dir")+"\\src\\Task_5\\Export.json");
                        default -> {viewModel.print("Incorrect input");
                            this.mainMenu();}
                    }
                    new CSVexport(book).exportTo("export.csv");}
                case 8 -> viewModel.bye();
                default -> {
                    viewModel.print("Incorrect input");
                    this.mainMenu();
                }
            }
        }
    }
}
