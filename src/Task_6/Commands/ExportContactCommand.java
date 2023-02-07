package Task_6.Commands;

import Task_6.Core.PhoneBookModel;
import Task_6.Core.PresenterPhoneBook;
import Task_6.Core.ViewModel;
import Task_6.Transfer.CSVexport;
import Task_6.Transfer.JSONexport;

public class ExportContactCommand extends BasicCommand {


    public ExportContactCommand(PresenterPhoneBook presenter) {
        super(presenter);
    }

    @Override
    public void execute() throws Exception {
        presenter.getViewModel().importExportMenu();
        switch (presenter.getViewModel().getChoice()) {
            case 1 ->
                    new CSVexport(presenter.getBook()).exportTo(System.getProperty("user.dir") + "\\src\\Task_5\\Export.csv");
            case 2 ->
                    new JSONexport(presenter.getBook()).exportTo(System.getProperty("user.dir") + "\\src\\Task_5\\Export.json");
            default -> {
                presenter.getViewModel().print("Incorrect input");
                presenter.getViewModel().mainMenu();
            }
        }
    }
}