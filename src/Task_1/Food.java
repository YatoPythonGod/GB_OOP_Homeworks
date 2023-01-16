package Task_1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Food extends Product{
    Date storageLife;
    protected Food(String name, double price, int count, String unit, Date storageLife) {
        super(name, price, count, unit);
        this.storageLife = storageLife;
    }

    public String getStorageLife(){
        return String.format("%1$td %1$tB %1$tY", this.storageLife);
    }

    public void setStorageLife(Date storageLife){
        this.storageLife = storageLife;
    }
    @Override
    public String toString() {
        return String.format("%sStorage life: %s\n", super.toString(), this.getStorageLife());
    }
}
