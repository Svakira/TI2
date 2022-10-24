package model;

import java.util.ArrayList;

public class Country {
    private String id;
    private String name;
    private double population;
    private String countryCode;

    private ArrayList<City> cities;

    public Country(String id, String name, double population, String countryCode) {
        cities= new ArrayList<>();
        this.id = id;
        this.name = name;
        this.population = population;
        this.countryCode = countryCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    public void insertCity(City city){
        cities.add(city);
    }

//INSERT INTO countries(id, name, population, countryCode) VALUES ('6ec3e8ec-3dd0-11ed-b878-0242ac120002', 'Colombia', 50.2, '+57')

    @Override
    public String toString() {
        return "INSERT INTO countries(" +
                "id" +',' +
                "name" + ',' +
                " population" +
                ", countryCode" +
                ')'+" VALUES (" +
                "'" + id + "'" +
                "," +"'"+ name + "'" +
                "," + population +
                "," + "'"+countryCode + "'" +
                ')';
    }
}
