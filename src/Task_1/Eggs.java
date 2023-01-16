package Task_1;

import java.util.Date;

public class Eggs extends Food {

    int piecesPerPack;

    public Eggs(String name, double price, int count, String unit, Date storageLife, int piecesPerPack) {
        super(name, price, count, unit, storageLife);
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
        return String.format("%sNumber of pieces per pack:%s\n", super.toString(), this.piecesPerPack);
    }

}
