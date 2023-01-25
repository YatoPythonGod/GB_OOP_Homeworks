package Task_3;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(10);
        Triangle triangle = new Triangle(5, 5, 5);

        Figures new_col = new Figures();

        new_col.addFigure(circle);
        new_col.addFigure(rectangle);
        new_col.addFigure(square);
        new_col.addFigure(triangle);
        System.out.println(new_col);
        new_col.getInfo();
        new_col.sort();
        System.out.println("_______________________");
        new_col.getInfo();
    }
}
