package Task_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tiger extends WildAnimal {
    public Tiger(int height, int weight, String colorEyes, String habitat, String dateDiscovery) throws ParseException {
        super(height, weight, colorEyes, habitat, dateDiscovery);
    }

    public Tiger(int height, int weight, String colorEyes, String habitat) throws ParseException {
        super(height, weight, colorEyes, habitat);

    }

    static Animal createTiger() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter eyes color:");
        String colorEyes = sc.nextLine();
        System.out.println("Please enter height:");
        int height = sc.nextInt();
        System.out.println("Please enter weight:");
        int weight = sc.nextInt();
        System.out.println("Please enter habitat:");
        String habitat = sc.nextLine();
        sc.close();
        return new Tiger(height, weight, colorEyes, habitat);
    }

    @Override
    void makeSound() {
        System.out.println("Tiger roar!!!");
    }

    @Override
    public void viewInfo() {
        System.out.println("Tiger:");
        super.viewInfo();
    }
}
