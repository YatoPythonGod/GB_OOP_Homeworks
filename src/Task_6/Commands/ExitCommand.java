package Task_6.Commands;

import Task_6.Core.PresenterPhoneBook;
import Task_6.Core.ViewModel;

public class ExitCommand extends BasicCommand{


    public ExitCommand(PresenterPhoneBook presenter) {
        super(presenter);
    }

    @Override
    public void execute() {
        presenter.viewModel.bye();
    }
}
