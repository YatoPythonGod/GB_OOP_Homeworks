package Task_6.Commands;

import Task_6.Core.PhoneBookModel;
import Task_6.Core.PresenterPhoneBook;
import Task_6.Core.ViewModel;
import Task_6.Transfer.CSVimport;
import Task_6.Transfer.JSONimport;

public class ImportContactCommand extends BasicCommand {


    public ImportContactCommand(PresenterPhoneBook presenter) {
        super(presenter);
    }

    @Override
    public void execute() throws Exception {
        presenter.getViewModel().importExportMenu();
        switch (presenter.getViewModel().getChoice()) {
            case 1 ->
                    new CSVimport(presenter.getBook()).importFrom(System.getProperty("user.dir") + "\\src\\Task_5\\" + presenter.getViewModel().getContactName("file"));
            case 2 ->
                    new JSONimport(presenter.getBook()).importFrom(System.getProperty("user.dir") + "\\src\\Task_5\\" + presenter.getViewModel().getContactName("file"));
            default -> {
                presenter.getViewModel().print("Incorrect input");
                presenter.getViewModel().mainMenu();
            }

        }
    }
}
