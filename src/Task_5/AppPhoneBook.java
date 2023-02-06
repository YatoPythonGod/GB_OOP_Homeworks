package Task_5;

import Task_5.Core.PresenterPhoneBook;
import Task_5.Transfer.Exporter;

public class AppPhoneBook {
    PresenterPhoneBook presenter;

    public AppPhoneBook(PresenterPhoneBook presenter){
        this.presenter = presenter;
    }
    void startButton() throws Exception {
        presenter.mainMenu();
    }

}
