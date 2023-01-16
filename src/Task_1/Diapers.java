package Task_1;

public class Diapers extends Baby {

    private int size;

    private int minWeight;

    private int maxWeight;

    private String type;

    public Diapers(String name, double price, int count, String unit, int minimumAge, boolean hypoallergenic, int size, int minWeight, int maxWeight, String type) {
        super(name, price, count, unit, minimumAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public int getSize() {
        return this.size;
    }

    public int getMinWeight() {
        return this.minWeight;
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }

    public String getType() {
        return this.type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setMinWeight(int minWeight) {
        this.minWeight = minWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%sType: %s\nSize: %s\nWeiht: %s - %s kg\n", super.toString(), this.type, this.size, this.minWeight, this.maxWeight);
    }
}
