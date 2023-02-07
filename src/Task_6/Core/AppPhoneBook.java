package Task_6.Core;

public class AppPhoneBook {
    PresenterPhoneBook presenter;

    public AppPhoneBook(PresenterPhoneBook presenter){
        this.presenter = presenter;
    }
    public void startButton() throws Exception {
        presenter.mainMenu();
    }

}
