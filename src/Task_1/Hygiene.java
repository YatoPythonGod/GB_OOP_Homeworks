package Task_1;

public class Hygiene extends Product {
    int piecesPerPack;

    protected Hygiene(String name, double price, int count, String unit, int piecesPerPack) {
        super(name, price, count, unit);
        this.piecesPerPack = piecesPerPack;
    }

    public int getPiecesPerPack() {
        return this.piecesPerPack;
    }

    public void setPiecesPerPack(int piecesPerPack) {
        this.piecesPerPack = piecesPerPack;
    }

    @Override
    public String toString() {
        return String.format("%sNumber of pieces per pack: %s\n", super.toString(), this.piecesPerPack);
    }
}
