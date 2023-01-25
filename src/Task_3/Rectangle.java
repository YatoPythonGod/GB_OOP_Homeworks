package Task_3;


import java.util.Scanner;

public class Rectangle extends Polygon {
    public Rectangle(double length, double width) {
        super(new double[]{length, width, length, width});

        if (length <= 0) {
            throw new IllegalArgumentException("Length value cannot be less than or equal to zero");
        }
        if (width <= 0) {
            throw new IllegalArgumentException("Width value cannot be less than or equal to zero");
        }

    }

    static public Rectangle createRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length: ");
        double length = sc.nextDouble();
        System.out.println("Please enter width: ");
        double width = sc.nextDouble();
        sc.close();
        return new Rectangle(length, width);
    }

    @Override
    double getArea() {
        return this.sides[0] * this.sides[1];
    }

    @Override
    void editFigure() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the new length: ");
        double new_length = sc.nextDouble();
        this.sides[0] = new_length;
        this.sides[2] = new_length;
        System.out.println("Please enter the new width: ");
        double new_width = sc.nextDouble();
        this.sides[1] = new_width;
        this.sides[3] = new_width;
        sc.close();
    }

    @Override
    public String toString() {
        return String.format("Rectangle  with length - %s and width %s\n", this.sides[0], this.sides[1]);
    }
}
