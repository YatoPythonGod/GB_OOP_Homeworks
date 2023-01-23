package Task_2;

public abstract class Bird extends Animal {

    protected int altitude;

    public Bird(int height, int weight, String colorEyes, int altitude) {
        super(height, weight, colorEyes);
        this.altitude = altitude;
    }

    public int getAltitude() {
        return altitude;
    }


    @Override
    public void viewInfo() {
        if (this.altitude != 0) System.out.printf("Altitude: %s\n", this.altitude);
        super.viewInfo();
    }
}
