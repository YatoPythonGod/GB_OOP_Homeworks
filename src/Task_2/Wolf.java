package Task_2;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.util.Scanner;

public class Wolf extends WildAnimal {

    enum State {
        Yes, No
    }

    private State alpha;

    public Wolf(int height, int weight, String colorEyes, String habitat, String dateDiscovery, State alpha) throws ParseException {
        super(height, weight, colorEyes, habitat, dateDiscovery);
        this.alpha = alpha;
    }

    public Wolf(int height, int weight, String colorEyes, String habitat, String dateDiscovery) throws ParseException {
        super(height, weight, colorEyes, habitat, dateDiscovery);
        this.alpha = State.No;
    }

    public Wolf(int height, int weight, String colorEyes, String habitat) throws ParseException {
        super(height, weight, colorEyes, habitat);
        this.alpha = State.No;
    }

    static Animal createWolf() throws ParseException {
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
        return new Wolf(height, weight, colorEyes, habitat);
    }

    @Override
    void makeSound() {
        System.out.println("Howl of a wolf");
    }

    @Override
    public void viewInfo() {
        System.out.printf("Wolf:\nAlpha: %s\n", this.alpha);
        super.viewInfo();
    }
}
