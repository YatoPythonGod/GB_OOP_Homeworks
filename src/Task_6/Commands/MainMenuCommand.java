package Task_6.Commands;

import Task_6.Core.ViewModel;
import Task_5.Main;

public class MainMenuCommand implements Command{
    ViewModel viewModel;

    public MainMenuCommand(ViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void execute() {
        viewModel.mainMenu();
    }
}
