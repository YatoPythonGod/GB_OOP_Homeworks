package Task_6;

import Task_6.Commands.*;
import Task_6.Core.AppPhoneBook;
import Task_6.Core.PhoneBookModel;
import Task_6.Core.PresenterPhoneBook;
import Task_6.Core.ViewConsole;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        PresenterPhoneBook presenter = new PresenterPhoneBook(new PhoneBookModel(), new ViewConsole(sc));
        presenter.addCommand(1, new ShowAllContactsCommand(presenter));
        presenter.addCommand(2, new AddContactCommand(presenter));
        presenter.addCommand(3, new DeleteContactCommand(presenter));
        presenter.addCommand(4, new FindContactCoomand(presenter));
        presenter.addCommand(5, new ChangeContactCommand(presenter));
        presenter.addCommand(6, new ImportContactCommand(presenter));
        presenter.addCommand(7, new ExportContactCommand(presenter));
        presenter.addCommand(8, new ExitCommand(presenter));



        AppPhoneBook app = new AppPhoneBook(presenter);


        app.startButton();


    }
}