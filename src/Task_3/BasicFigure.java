package Task_3;

public abstract class BasicFigure implements Comparable<BasicFigure> {
    abstract double getArea();

    abstract void editFigure();

    @Override
    public int compareTo(BasicFigure o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}
