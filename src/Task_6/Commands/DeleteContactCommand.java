package Task_6.Commands;

import Task_6.Core.PhoneBookModel;
import Task_6.Core.PresenterPhoneBook;
import Task_6.Core.ViewModel;

public class DeleteContactCommand extends BasicCommand {


    public DeleteContactCommand(PresenterPhoneBook presenter) {
        super(presenter);
    }

    @Override
    public void execute() {
        if (presenter.getBook().deleteContact(presenter.getViewModel().getContactName())) {
            presenter.getViewModel().print("Done!");
            presenter.getViewModel().mainMenu();
        } else {
            presenter.getViewModel().print("Contact not found!");
            presenter.getViewModel().mainMenu();
        }

    }
}
