package Task_3;

import java.util.Scanner;


public class Triangle extends Polygon {
    protected Triangle(double side_1, double side_2, double side_3) {
        super(new double[]{side_1, side_2, side_3});
        if (side_1 <= 0 || side_2 <= 0 || side_3 <= 0) {
            throw new IllegalArgumentException(String.format("Such a triangle cannot be created, all sides of the triangle must be greater than zero!\n" +
                    " Side 1 = %s, Side 2 = %s, Side 3 = %s", side_1, side_2, side_3));
        }
        if (side_1 + side_2 <= side_3) {
            throw new IllegalArgumentException("Such a triangle cannot be created - side_3 >= side_1 + side_2");
        }
        if (side_1 + side_3 <= side_2) {
            throw new IllegalArgumentException("Such a triangle cannot be created - side_2 >= side_1 + side_3");
        }
        if (side_2 + side_3 <= side_1) {
            throw new IllegalArgumentException("Such a triangle cannot be created - side_1 >= side_2 + side_3");
        }
    }


    static public Triangle createTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of the first side: ");
        double side_1 = sc.nextDouble();
        System.out.println("Please enter length of the second side: ");
        double side_2 = sc.nextDouble();
        System.out.println("Please enter length of the third side: ");
        double side_3 = sc.nextDouble();
        sc.close();
        return new Triangle(side_1, side_2, side_3);
    }

    @Override
    double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.sides[0]) * (p - this.sides[1]) * (p - this.sides[1]));
    }

    @Override
    void editFigure() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the new length of the first side: ");
        double side_1 = sc.nextDouble();
        this.sides[1] = side_1;
        System.out.println("Please enter the new length of the second side: ");
        double side_2 = sc.nextDouble();
        this.sides[2] = side_2;
        System.out.println("Please enter the new length of the third side: ");
        double side_3 = sc.nextDouble();
        this.sides[3] = side_3;
        sc.close();
    }

    @Override
    public String toString() {
        return String.format("Triangle with sides: %s, %s, %s\n", this.sides[0], this.sides[1], this.sides[2]);
    }
}
