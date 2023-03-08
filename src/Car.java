public class Car {
    private Car[] model;
    private int years;
    private String name;

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(int years, String name) {
        this.years = years;
        this.name = name;
    }

    public Car[] getModel() {
        return model;
    }

    public void setModel(Car[] model) {
        this.model = model;
    }
}
