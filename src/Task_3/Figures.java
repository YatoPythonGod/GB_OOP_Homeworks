package Task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Figures implements Iterable<BasicFigure> {
    private ArrayList<BasicFigure> figures;
    private int index;

    public Figures() {
        figures = new ArrayList<BasicFigure>();
        index = 0;
    }

    public void addFigure(BasicFigure figure) {
        figures.add(figure);
    }

    public void addFigure() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Which geometric figure to add?
                1. Circle
                2. Square
                3. Triangle
                4. Rectangle
                """);
        int answer = sc.nextInt();
        switch (answer) {
            case 1 -> this.addFigure(Circle.createCircle());
            case 2 -> this.addFigure(Square.createSquare());
            case 3 -> this.addFigure(Triangle.createTriangle());
            case 4 -> this.addFigure(Rectangle.createRectangle());
            default -> {
                System.out.println("Incorrect input");
                this.addFigure();
            }
        }
    }

    public void removeFigure(int index) {
        figures.remove(index);
    }

    public void removeFigure() {
        if (figures.size() > 0) figures.remove(figures.size() - 1);
    }

    public void editFigure(int index) {
        if (index > figures.size() - 1) {
            System.out.println("Index out od range");
            return;
        } else {
            System.out.println(figures.get(index));
            figures.get(index).editFigure();

        }
    }


    public void getInfo() {
        for (BasicFigure figure : this.figures) {
            if (figure instanceof Perimeter) {
                System.out.printf("Perimeter %s: ", figure.getClass().getSimpleName());
                System.out.println(((Perimeter) figure).getPerimeter());
            }
            if (figure instanceof CircleLength) {
                System.out.printf("Circle length %s: ", figure.getClass().getSimpleName());
                System.out.println(((CircleLength) figure).getCircleLength());
            }
            System.out.printf("Area %s: ", figure.getClass().getSimpleName());
            System.out.println(figure.getArea());
        }
    }

    public void sort() {
        Collections.sort(figures);
    }

    @Override
    public Iterator<BasicFigure> iterator() {
        Iterator<BasicFigure> it = new Iterator<BasicFigure>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < figures.size();
            }

            @Override
            public BasicFigure next() {
                return figures.get(index++);
            }

        };
        return it;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        this.figures.forEach(figure -> result.append(figure.toString()));
        return result.toString();
    }

}
