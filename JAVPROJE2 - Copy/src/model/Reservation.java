package model;

public class Reservation {
    private Flight flight;
    private String name;
    private String surname;
    private int age;

    public Reservation(Flight flight, String name, String surname, int age) {
        this.flight = flight;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Flight getFlight() { return flight; }

    @Override
    public String toString() {
        return name + " " + surname + " (" + age + " yaşında) - " + flight;
    }

    public String toFileString() {
        return name + "," + surname + "," + age + "," +
                flight.getLocation().getCountry() + "," +
                flight.getLocation().getCity() + "," +
                flight.getLocation().getAirport() + "," +
                flight.getTime() + "," +
                flight.getAirplane().getModel();
    }
}
