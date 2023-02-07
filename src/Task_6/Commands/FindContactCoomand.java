package Task_6.Commands;

import Task_6.Core.PhoneBookModel;
import Task_6.Core.PresenterPhoneBook;
import Task_6.Core.ViewModel;

public class FindContactCoomand extends BasicCommand{


    public FindContactCoomand(PresenterPhoneBook presenter) {
        super(presenter);
    }

    @Override
    public void execute() {
        presenter.getViewModel().showContact(presenter.getBook().searchContact(presenter.getViewModel().getContactName()));
    }
}

