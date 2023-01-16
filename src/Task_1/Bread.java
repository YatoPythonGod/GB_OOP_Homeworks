package Task_1;

import java.util.Date;

public class Bread extends Food{

    private String typeFlour;
    public Bread(String name, double price, int count, String unit, Date storageLife, String typeFlour) {
        super(name, price, count, unit, storageLife);
        this.typeFlour = typeFlour;
    }

    public String getTypeFlour(){
        return this.typeFlour;
    }

    public void setTypeFlour(String typeFlour){
        this.typeFlour = typeFlour;
    }

    @Override
    public String toString() {
        return String.format("%sType of flour: %s\n", super.toString(), this.typeFlour);
    }
}
