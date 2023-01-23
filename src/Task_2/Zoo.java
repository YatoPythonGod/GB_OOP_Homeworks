package Task_2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    private ArrayList<Animal> animals;


    public Zoo(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    static Animal createAnimal() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                What kind of animal do you want to create?
                1. Home animal
                2. Wild animal
                3. Bird
                """);
        String firstAnswer = sc.nextLine();
        switch (firstAnswer) {
            case "1":
                System.out.println("""
                        1.Dog
                        2.Cat
                        """);
                String secondAnswer = sc.nextLine();
                switch (secondAnswer) {
                    case "1" -> {
                        return Dog.createDog();
                    }
                    case "2" -> {
                        return Cat.createCat();
                    }
                    default -> {
                        System.out.println("Incorrect input!");
                        createAnimal();
                    }
                }
            case "2":
                System.out.println("""
                        1.Wolf
                        2.Tiger
                        """);
                String thirdAnswer = sc.nextLine();
                switch (thirdAnswer) {
                    case "1" -> {
                        return Wolf.createWolf();
                    }
                    case "2" -> {
                        return Tiger.createTiger();
                    }
                    default -> {
                        System.out.println("Incorrect input!");
                        createAnimal();
                    }
                }
            case "3":
                System.out.println("""
                        1.Chicken
                        2.Stork
                        """);
                String fourAnswer = sc.nextLine();
                switch (fourAnswer) {
                    case "1" -> {
                        return Chicken.createChicken();
                    }
                    case "2" -> {
                        return Stork.createStork();
                    }
                    default -> {
                        System.out.println("Incorrect input!");
                        createAnimal();
                    }
                }
            default:
                System.out.println("Incorrect input!");
                createAnimal();
        }

        return null;
    }

    private void showMenu() {
        System.out.println("""
                1 - Add an animal to the zoo
                2 - Remove the animal from the zoo
                3 - Print information about a specific animal
                4 - Print information about ALL animals in Zoo
                5 - Asking a specific animal to make a sound
                6 - Asking ALL animals to make a sound
                help - Show commands
                exit - Exit the menu""");
    }

    public void menu() throws ParseException {
        Scanner sc = new Scanner(System.in);
        this.showMenu();
        while (true) {
            System.out.println("Your choice?");
            String line = sc.nextLine();
            switch (line) {
                case "exit":
                    sc.close();
                    return;
                case "help":
                    this.showMenu();
                    break;
                case "1":
                    this.animals.add(createAnimal());
                    System.out.println("The animal is created.");
                    this.viewInfo(this.animals.size() - 1);
                    sc.close();
                    return;
                case "2":
                    System.out.println("Enter index animal: ");
                    int index = sc.nextInt();
                    this.removeAnimal(index);
                    sc.close();
                    return;
                case "3":
                    System.out.println("Enter index animal: ");
                    int i_index = sc.nextInt();
                    this.viewInfo(i_index);
                    sc.close();
                    return;
                case "4":
                    this.viewInfo();
                    sc.close();
                    return;
                case "5":
                    System.out.println("Enter index animal: ");
                    int s_index = sc.nextInt();
                    this.makeSound(s_index);
                    sc.close();
                    return;
                case "6":
                    this.makeSound();
                    sc.close();
                    return;
                default:
                    System.out.println("Incorrect input!");
                    sc.close();
                    this.menu();
            }
        }
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(int index) {
        this.animals.remove(index);
    }


    public void viewInfo(int index) {
        if (index < this.animals.size()) {
            this.animals.get(index).viewInfo();
        } else System.out.printf("There is no animal with an index in the zoo - %d", index);
    }


    public void viewInfo() {

        for (Animal animal : this.animals) {
            animal.viewInfo();
            System.out.println();
        }
    }

    public void makeSound(int index) {
        if (index < this.animals.size()) {
            this.animals.get(index).makeSound();
        } else System.out.printf("There is no animal with an index in the zoo - %d", index);
    }

    public void makeSound() {
        this.animals.forEach(Animal::makeSound);
    }

}
