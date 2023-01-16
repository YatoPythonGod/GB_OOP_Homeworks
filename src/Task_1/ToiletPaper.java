package Task_1;

public class ToiletPaper extends Hygiene {

    private int numLayers;

    public ToiletPaper(String name, double price, int count, String unit, int piecesPerPack, int numLayers) {
        super(name, price, count, unit, piecesPerPack);
        this.numLayers = numLayers;
    }

    public int getNumLayers() {
        return this.numLayers;
    }

    public void setNumLayers(int numLayers) {
        this.numLayers = numLayers;
    }


    public String toString() {
        return String.format("%sNumber of layers: %d\n", super.toString(), this.numLayers);
    }

}
