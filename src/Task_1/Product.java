package Task_1;

public class Product {
    private String name;
    private double price;
    private int count;
    private String unit;

    protected Product (String name, double price, int count, String unit){
        this.name = name;
        this.price = price;
        this.count = count;
        this.unit = unit;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getCount(){
        return this.count;
    }

    public String getUnit(){
        return this.unit;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setCount(int count){
        this.count  = count ;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

    @Override
    public String toString() {
        return String.format("%s: %s rub | %d %s\n", this.name, this.price, this.count, this.unit);
    }

}
