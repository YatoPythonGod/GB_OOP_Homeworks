package Task_6.Commands;

import Task_6.Core.PhoneBookModel;
import Task_6.Core.PresenterPhoneBook;
import Task_6.Core.ViewModel;

public abstract class BasicCommand implements Command{

    PresenterPhoneBook presenter;

    public BasicCommand(PresenterPhoneBook presenter) {
        this.presenter = presenter;
    }
}
