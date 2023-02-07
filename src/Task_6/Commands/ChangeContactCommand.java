package Task_6.Commands;

import Task_6.Core.PhoneBookModel;
import Task_6.Core.PresenterPhoneBook;
import Task_6.Core.ViewModel;

public class ChangeContactCommand extends BasicCommand {


    public ChangeContactCommand(PresenterPhoneBook presenter) {
        super(presenter);
    }

    @Override
    public void execute() {
        String temp_name = presenter.getViewModel().getContactName();
        while (presenter.getBook().searchContact(temp_name) == null) {
            presenter.getViewModel().showBook(presenter.getBook());
            temp_name = presenter.getViewModel().getContactName();
        }
        presenter.getViewModel().updateContactMenu();
        switch (presenter.getViewModel().getChoice()) {
            case 1 -> {
                presenter.getBook().updateContactName(temp_name, presenter.getViewModel().getContactName("new"));
                presenter.getViewModel().print("Done!");
                presenter.getViewModel().mainMenu();
            }
            case 2 -> {
                int count_phones = 1;
                for (String phone : presenter.getBook().searchContact(temp_name).getPhoneNumbers()) {
                    System.out.printf("%d. %s\n", count_phones++, phone);
                }
                presenter.getBook().updatePhoneNumber(temp_name, presenter.getViewModel().getChoice("which number do you want to change"), presenter.getViewModel().getPhoneNumber());
                presenter.getViewModel().print("Done!");
                presenter.getViewModel().mainMenu();
            }
            case 3 -> {
                int count_emails = 1;
                for (String phone : presenter.getBook().searchContact(temp_name).getPhoneNumbers()) {
                    System.out.printf("%d. %s", count_emails++, phone);
                }
                presenter.getBook().updateEmails(temp_name, presenter.getViewModel().getChoice("which email do you want to change:"), presenter.getViewModel().getEmail());
                presenter.getViewModel().print("Done!");
                presenter.getViewModel().mainMenu();
            }
            default -> {
                presenter.getViewModel().print("Incorrect input");
                this.execute();
            }

        }
    }
}
