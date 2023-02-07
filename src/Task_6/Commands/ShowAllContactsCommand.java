package Task_6.Commands;

import Task_6.Core.PhoneBookModel;
import Task_6.Core.PresenterPhoneBook;
import Task_6.Core.ViewModel;

public class ShowAllContactsCommand extends BasicCommand{


    public ShowAllContactsCommand(PresenterPhoneBook presenter) {
        super(presenter);
    }

    @Override
    public void execute() {
        presenter.getViewModel().showBook(presenter.getBook());
    }
}

