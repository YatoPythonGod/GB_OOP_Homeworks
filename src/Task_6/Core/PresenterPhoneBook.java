package Task_6.Core;


import Task_6.Commands.Command;


import java.util.HashMap;

public class PresenterPhoneBook {
    private HashMap<Integer, Command> commands;
    private PhoneBookModel book;

    public ViewModel viewModel;

    public PresenterPhoneBook(HashMap<Integer, Command> commands, PhoneBookModel book, ViewModel viewModel) {
        this.commands = commands;
        this.viewModel = viewModel;
        this.book = book;
    }

    public PresenterPhoneBook(PhoneBookModel book, ViewModel viewModel) {
        this.commands = new HashMap<Integer, Command>();
        this.viewModel = viewModel;
        this.book = book;
    }

    public PhoneBookModel getBook() {
        return book;
    }

    public void addCommand(int i, Command command){
        commands.put(i, command);
    }

    public ViewModel getViewModel() {
        return viewModel;
    }

    public void mainMenu() throws Exception {
        int user_choice = 0;
        while (user_choice != 8) {
            viewModel.mainMenu();
            user_choice = viewModel.getChoice("number");
            commands.get(user_choice).execute();
        }
    }
}
