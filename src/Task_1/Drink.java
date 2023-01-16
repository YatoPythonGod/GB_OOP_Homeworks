package Task_1;

public class Drink extends Product {
    double volume;

    protected Drink(String name, double price, int count, String unit, double volume) {
        super(name, price, count, unit);
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%sVolume: %s ml\n", super.toString(), this.volume);
    }
}
