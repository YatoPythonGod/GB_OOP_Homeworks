package Task_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;


public abstract class HomeAnimal extends Animal {

    protected String name;
    protected String breed;
    protected String coatColor;
    protected Date birthdate;

    HashMap<String, ArrayList<Date>> vaccinations;

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getCoatColor() {
        return coatColor;
    }

    public HashMap<String, ArrayList<Date>> getVaccinations() {
        return vaccinations;
    }

    public HomeAnimal(int height, int weight, String colorEyes, String name, String coatColor, String birthdate, String breed, HashMap<String, ArrayList<Date>> vaccinations) throws ParseException {
        super(height, weight, colorEyes);
        this.name = name;
        this.breed = breed;
        this.coatColor = coatColor;
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        this.birthdate = formatter.parse(birthdate);
        this.vaccinations = vaccinations;

    }

    public HomeAnimal(int height, int weight, String colorEyes, String name, String coatColor, String birthdate, String breed) throws ParseException {
        this(height, weight, colorEyes, name, coatColor, birthdate, breed, new HashMap<String, ArrayList<Date>>());

    }

    public HomeAnimal(int height, int weight, String colorEyes, String name, String coatColor, String birthdate) throws ParseException {
        this(height, weight, colorEyes, name, coatColor, birthdate, "mongrel", new HashMap<String, ArrayList<Date>>());

    }


    @Override
    public void viewInfo() {
        System.out.printf("Name: %s\nBreed: %s\nColor: %s\nDate of birth: %s\n", this.name, this.breed, this.coatColor, this.birthdate);
        super.viewInfo();
        if (!this.vaccinations.isEmpty()) {
            System.out.print("Vaccinations:\n");
            for (Entry<String, ArrayList<Date>> vaccine : this.vaccinations.entrySet()) {
                System.out.printf("%s: %s\n", vaccine.getKey(), vaccine.getValue());
            }
        } else System.out.print("Vaccinations: not vaccinated!\n");
    }

    abstract void showAffection();

    public void getVaccinated(String name, String sdate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        Date date = formatter.parse(sdate);
        if (this.vaccinations.containsKey(name)) {
            this.vaccinations.get(name).add(date);
        } else {
            ArrayList<Date> dates = new ArrayList<>();
            dates.add(date);
            this.vaccinations.put(name, dates);
        }
    }
}
