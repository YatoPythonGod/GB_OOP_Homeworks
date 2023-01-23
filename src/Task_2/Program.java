package Task_2;

import java.text.ParseException;

public class Program {
    public static void main(String[] args) throws ParseException {
        Animal cat = new Cat(15, 7, "green", "Barsik", "white", "12.13.2017");
        Chicken chicken = new Chicken(10, 2, "black");
        Dog dog = new Dog(25, 25, "brown", "Ice", "white", "01.09.2015", "husky");
        Tiger tiger = new Tiger(40, 100, "green", "savannah");
        Wolf wolf = new Wolf(30, 30, "blue", "forest");
        Stork stork = new Stork(35, 5, "black", 50);

        Zoo myZoo = new Zoo();
        myZoo.addAnimal(cat);
        myZoo.addAnimal(chicken);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(tiger);
        myZoo.addAnimal(wolf);
        myZoo.addAnimal(stork);


        myZoo.viewInfo();
        System.out.println();
        myZoo.makeSound();
        myZoo.menu();

    }
}
