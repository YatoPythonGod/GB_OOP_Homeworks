package Task_3;

import java.util.Scanner;

public class Circle extends BasicFigure implements CircleLength {

    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("The radius value cannot be less than or equal to zero");
        }
        this.radius = radius;
    }

    public void editFigure(double radius) {
        this.radius = radius;
    }

    static public Circle createCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius: ");
        double radius = sc.nextDouble();
        sc.close();
        return new Circle(radius);
    }


    @Override
    public void editFigure() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a new radius: ");
        this.radius = sc.nextDouble();
        sc.close();
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getCircleLength() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return String.format("Circle with radius: %s\n", this.radius);
    }

}
