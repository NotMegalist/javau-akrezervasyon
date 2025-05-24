package model;

public class Flight {
    private Location location;
    private String time;
    private Airplane airplane;

    public Flight(Location location, String time, Airplane airplane) {
        this.location = location;
        this.time = time;
        this.airplane = airplane;
    }

    public Location getLocation() { return location; }
    public String getTime() { return time; }
    public Airplane getAirplane() { return airplane; }

    @Override
    public String toString() {
        return "Uçuş: " + location + " | Saat: " + time + " | Uçak: " + airplane;
    }
}
