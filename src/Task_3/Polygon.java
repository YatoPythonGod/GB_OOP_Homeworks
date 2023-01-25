package Task_3;


public abstract class Polygon extends BasicFigure implements Perimeter {

    protected double[] sides;

    protected Polygon(double[] sides) {
        this.sides = sides;
    }

    public double getPerimeter() {
        double result = 0;
        for (double side : this.sides) {
            result += side;
        }
        return result;
    }
}
