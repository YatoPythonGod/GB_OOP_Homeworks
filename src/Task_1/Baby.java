package Task_1;

public class Baby extends Product {

    int minimumAge;
    boolean hypoallergenic;

    protected Baby(String name, double price, int count, String unit, int minimumAge, boolean hypoallergenic) {
        super(name, price, count, unit);
        this.minimumAge = minimumAge;
        this.hypoallergenic = hypoallergenic;
    }

    public int getMinimumAge() {
        return this.minimumAge;
    }

    public boolean getHypoallergenic() {
        return this.hypoallergenic;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public void setHypoallergenic(boolean hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }

    @Override
    public String toString() {
        return String.format("%sMinimum age: %s years\nHypoallergenic: %s\n", super.toString(), this.minimumAge, this.hypoallergenic);
    }
}
