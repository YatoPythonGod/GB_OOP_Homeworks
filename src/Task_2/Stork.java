package Task_2;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.Scanner;

public class Stork extends Bird implements Fly {
    public Stork(int height, int weight, String colorEyes, int altitude) {
        super(height, weight, colorEyes, altitude);
    }


    static Animal createStork() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter eyes color:");
        String colorEyes = sc.nextLine();
        System.out.println("Please enter height:");
        int height = sc.nextInt();
        System.out.println("Please enter weight:");
        int weight = sc.nextInt();
        System.out.println("Please enter altitude:");
        int altitude = sc.nextInt();
        sc.close();
        return new Stork(height, weight, colorEyes, altitude);
    }

    @Override
    void makeSound() {
        System.out.println("Stork: makes a sound!!!");

    }

    @Override
    public void fly() {
        System.out.printf("I'm flying at %s meters!%n", super.altitude);
    }

    @Override
    public void viewInfo() {
        System.out.println("Stork:");
        super.viewInfo();
    }
}
