package model;

public class City {
    private String id;
    private String name;
    private String countryID;
    private double population;

    public City(String id, String name, String countryID, double population) {
        this.id = id;
        this.name = name;
        this.countryID = countryID;
        this.population = population;
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

    public String getCountryID() {
        return countryID;
    }

    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }
    //INSERT INTO cities(id, name, countryID, population) VALUES ('e4aa04f6-3dd0-11ed-b878-0242ac120002', 'Cali', '6ec3e8ec-3dd0-11ed-b878-0242ac120002', 2.2)
    @Override
    public String toString() {
        return "INSERT INTO cities(" +
                "id" +',' +
                "name" + ',' +
                " countryID" +
                ", population" +
                ')'+" VALUES (" +
                "'" + id + "'" +
                "," +"'"+ name + "'" +
                "," + countryID +
                "," + "'"+ population + "'" +
                ')';
    }
}
