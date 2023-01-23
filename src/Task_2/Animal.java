package Task_2;

public abstract class Animal {

    protected int height;
    protected int weight;
    protected String colorEyes;

    public Animal(int height, int weight, String colorEyes) {
        this.height = height;
        this.weight = weight;
        this.colorEyes = colorEyes;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getColorEyes() {
        return colorEyes;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColorEyes(String colorEyes) {
        this.colorEyes = colorEyes;
    }

    abstract void makeSound();

    public void viewInfo() {
        System.out.printf("Height: %s\nWeight: %s\nColor eyes: %s\n", this.height, this.weight, this.colorEyes);
    }
}
