package Task_5;

import Task_5.Core.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        AppPhoneBook app = new AppPhoneBook(new PresenterPhoneBook(new ViewConsole(sc), new PhoneBookModel()));
        app.startButton();


    }
}