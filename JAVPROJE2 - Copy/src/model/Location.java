package model;

public class Location {
    private String country;
    private String city;
    private String airport;
    private boolean isActive;

    public Location(String country, String city, String airport, boolean isActive) {
        this.country = country;
        this.city = city;
        this.airport = airport;
        this.isActive = isActive;
    }

    public String getCountry() { return country; }
    public String getCity() { return city; }
    public String getAirport() { return airport; }
    public boolean isActive() { return isActive; }

    @Override
    public String toString() {
        return city + ", " + country + " - " + airport + (isActive ? " [Aktif]" : " [Pasif]");
    }
}
