package Task_2;

import java.text.ParseException;
import java.util.Scanner;

public class Chicken extends Bird {
    public Chicken(int height, int weight, String colorEyes, int altitude) {
        super(height, weight, colorEyes, altitude);
    }

    public Chicken(int height, int weight, String colorEyes) {
        this(height, weight, colorEyes, 0);
    }


    static Animal createChicken() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter eyes color:");
        String colorEyes = sc.nextLine();
        System.out.println("Please enter height:");
        int height = sc.nextInt();
        System.out.println("Please enter weight:");
        int weight = sc.nextInt();
        sc.close();
        return new Chicken(height, weight, colorEyes);
    }

    @Override
    void makeSound() {
        System.out.println("Chicken: Cluck-Cluck-Cluck!");
    }

    @Override
    public void viewInfo() {
        System.out.println("Chicken:");
        super.viewInfo();
    }
}
