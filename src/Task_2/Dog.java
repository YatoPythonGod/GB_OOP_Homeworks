package Task_2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Dog extends HomeAnimal {

    enum State {
        Yes, No
    }

    private State trained;

    public Dog(int height, int weight, String colorEyes, String name, String coatColor, String birthdate, String breed, HashMap<String, ArrayList<Date>> vaccinations, State trained) throws ParseException {
        super(height, weight, colorEyes, name, coatColor, birthdate, breed, vaccinations);
        this.trained = trained;
    }

    public Dog(int height, int weight, String colorEyes, String name, String coatColor, String birthdate, String breed, HashMap<String, ArrayList<Date>> vaccinations) throws ParseException {
        this(height, weight, colorEyes, name, coatColor, birthdate, breed, vaccinations, State.No);
    }

    public Dog(int height, int weight, String colorEyes, String name, String coatColor, String birthdate, String breed) throws ParseException {
        this(height, weight, colorEyes, name, coatColor, birthdate, breed, new HashMap<String, ArrayList<Date>>());
    }

    public void Train() {
        if (this.trained == State.No) {
            this.trained = State.Yes;
        }
    }

    public State getTrained() {
        return trained;
    }


    static Animal createDog() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name:");
        String name = sc.nextLine();
        System.out.println("Please enter breed:");
        String breed = sc.nextLine();
        System.out.println("Please enter date of birth:");
        String birthdate = sc.nextLine();
        System.out.println("Please enter color:");
        String coatColor = sc.nextLine();
        System.out.println("Please enter eyes color:");
        String colorEyes = sc.nextLine();
        System.out.println("Please enter height:");
        int height = sc.nextInt();
        System.out.println("Please enter weight:");
        int weight = sc.nextInt();
        sc.close();
        return new Dog(height, weight, colorEyes, name, coatColor, birthdate, breed);
    }

    @Override
    void showAffection() {
        System.out.println("The dog licked you");
    }

    @Override
    void makeSound() {
        System.out.printf("%s: Woof-woof!\n", this.name);
    }

    @Override
    public void viewInfo() {
        System.out.printf("Dog:\nTrained: %s\n", this.trained);
        super.viewInfo();
    }

}
