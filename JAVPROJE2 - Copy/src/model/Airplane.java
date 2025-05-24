package model;

public class Airplane {
    private String model;
    private String brand;
    private String serialNumber;
    private int seatCapacity;

    public Airplane(String model, String brand, String serialNumber, int seatCapacity) {
        this.model = model;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.seatCapacity = seatCapacity;
    }

    public String getModel() { return model; }
    public String getBrand() { return brand; }
    public String getSerialNumber() { return serialNumber; }
    public int getSeatCapacity() { return seatCapacity; }

    @Override
    public String toString() {
        return brand + " " + model + " (Seri No: " + serialNumber + ", Kapasite: " + seatCapacity + ")";
    }
}
