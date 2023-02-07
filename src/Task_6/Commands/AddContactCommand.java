package Task_6.Commands;

import Task_6.Core.PhoneBookModel;
import Task_6.Core.PresenterPhoneBook;
import Task_6.Core.ViewModel;
import Task_6.Core.Contact;

public class AddContactCommand extends BasicCommand{


    public AddContactCommand(PresenterPhoneBook presenter) {
        super(presenter);
    }

    @Override
    public void execute() throws Exception {

        presenter.getBook().addContact(new Contact(presenter.getViewModel().getContactName(), presenter.getViewModel().getPhoneNumber(), presenter.getViewModel().getEmail()));

    }
}
