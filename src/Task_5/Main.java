package Task_5;

import Task_5.Core.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
//        Contact new_contact = new Contact("Vasya", "89261778980", "vas@vas.ru");
////        System.out.println(PhoneNumberValidityCheck.isValidPhoneNumber("+79261s778980"));
//        System.out.println(new_contact);
        Scanner sc = new Scanner(System.in);
        AppPhoneBook app = new AppPhoneBook(new PresenterPhoneBook(new ViewConsole(sc), new PhoneBookModel()));
        app.startButton();


    }
}