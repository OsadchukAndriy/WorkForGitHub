package ru.skillbox;

public class Country {
    private String name;
    private int population;
    private double areaInSquareKilometers;
    private String capitalName;
    private boolean landlocked;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getAreaInSquareKilometers() {
        return areaInSquareKilometers;
    }

    public void setAreaInSquareKilometers(double areaInSquareKilometers) {
        this.areaInSquareKilometers = areaInSquareKilometers;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public boolean isLandlocked() {
        return landlocked;
    }

    public void setLandlocked(boolean landlocked) {
        this.landlocked = landlocked;
    }

    public Country (String countryName){
        this.name = countryName;
    }

}
