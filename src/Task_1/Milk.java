package Task_1;

import java.util.Date;

public class Milk extends Drink {
    private double fatContent;
    private Date storageLife;

    public Milk(String name, double price, int count, String unit, double volume, double fatContent, Date storageLife) {
        super(name, price, count, unit, volume);
        this.fatContent = fatContent;
        this.storageLife = storageLife;
    }

    public double getFatContent() {
        return fatContent;
    }

    public String getStorageLife() {
        return String.format("%1$td %1$tB %1$tY", this.storageLife);
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public void setStorageLife(Date storageLife) {
        this.storageLife = storageLife;
    }

    @Override
    public String toString() {
        return String.format("%sFat content: %s%s\nStorage life: %s\n", super.toString(), this.fatContent, "%", this.getStorageLife());
    }
}

