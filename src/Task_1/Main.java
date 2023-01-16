package Task_1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product bread = new Bread("White bread", 45.3,1,"pieces", (new Date(123, 0, 25)), "wheat");
        Product diapers = new Diapers("Simple diapers", 150, 2, "pieces", 2, true, 5, 8, 12, "normal");
        Product eggs = new Eggs("Extra eggs", 80, 4, "pieces", (new Date(123, 0, 27)), 10);
        Product pepsi = new Lemonade("Pepsi", 100, 10, "pieces", 0.5);
        Product milk = new Milk("Domik v derevne", 80, 5, "pieces", 1.0, 3.5, (new Date(123, 0, 22)));
        Product masks = new Masks("Simple mask", 5, 20, "pieces", 100);
        Product pacifier = new Pacifier("Baby pacifier", 100, 10, "pieces", 2, true);
        Product toiletPaper = new ToiletPaper("Zewa", 50 , 10, "pieces", 10, 2);

        Product [] shipment = new Product[]{bread, diapers, eggs, pepsi, milk, masks, pacifier, toiletPaper};

        Program.getInfo(shipment);

    }
}
