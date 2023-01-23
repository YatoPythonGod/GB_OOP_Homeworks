package Task_2;

import java.text.ParseException;
import java.util.*;

public class Cat extends HomeAnimal {

    private boolean coat;

    public Cat(int height, int weight, String colorEyes, String name, String coatColor, String birthdate, String breed, HashMap<String, ArrayList<Date>> vaccinations) throws ParseException {
        super(height, weight, colorEyes, name, coatColor, birthdate, breed, vaccinations);
        this.coat = !this.coatColor.equals("No".toLowerCase());
    }

    public Cat(int height, int weight, String colorEyes, String name, String coatColor, String birthdate, String breed) throws ParseException {
        this(height, weight, colorEyes, name, coatColor, birthdate, breed, new HashMap<String, ArrayList<Date>>());
    }


    public Cat(int height, int weight, String colorEyes, String name, String coatColor, String birthdate) throws ParseException {
        this(height, weight, colorEyes, name, coatColor, birthdate, "mongrel");
    }


    static Animal createCat() throws ParseException {
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
        return new Cat(height, weight, colorEyes, name, coatColor, birthdate, breed);
    }

    public boolean getCoat() {
        return this.coat;
    }

    @Override
    public void showAffection() {
        System.out.println("Cat: Mrrr... mrrr..\n");
    }

    @Override
    public void makeSound() {
        System.out.printf("%s: Meow!\n", this.name);
    }

}
