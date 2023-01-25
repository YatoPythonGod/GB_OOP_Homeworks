package Task_3;


import java.util.Scanner;

public class Square extends Rectangle {
    public Square(double length) {
        super(length, length);
    }


    static public Square createSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter side length: ");
        double length = sc.nextDouble();
        sc.close();
        return new Square(length);
    }

    public void editFigure(double length) {
        this.sides[0] = length;
        this.sides[1] = length;
        this.sides[2] = length;
        this.sides[3] = length;
    }

    @Override
    public void editFigure() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a new side length: ");
        double new_length = sc.nextDouble();
        this.sides[0] = new_length;
        this.sides[1] = new_length;
        this.sides[2] = new_length;
        this.sides[3] = new_length;
        sc.close();
    }

    @Override
    public String toString() {
        return String.format("Square with side length: %s\n", this.sides[0]);
    }
}
