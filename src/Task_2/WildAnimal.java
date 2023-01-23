package Task_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public abstract class WildAnimal extends Animal {
    protected Date dateDiscovery;
    protected String habitat;

    public WildAnimal(int height, int weight, String colorEyes, String habitat, String dateDiscovery) throws ParseException {
        super(height, weight, colorEyes);
        this.habitat = habitat;
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        this.dateDiscovery = formatter.parse(dateDiscovery);
    }

    public WildAnimal(int height, int weight, String colorEyes, String habitat) throws ParseException {
        this(height, weight, colorEyes, habitat, new SimpleDateFormat("dd.MM.yyyy").format(new Date()));

    }

    @Override
    public void viewInfo() {
        System.out.printf("Date of discovery: %s\nHabitat: %s\n", this.dateDiscovery, this.habitat);
        super.viewInfo();
    }

}
