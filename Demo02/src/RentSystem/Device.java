package RentSystem;

public abstract class Device implements Rentable {
    private String id;
    private String brand;
    private double baseDailyRate;
    public Device(String id, String brand, double baseDailyRate) {
        this.id = id;
        this.brand = brand;
        this.baseDailyRate = baseDailyRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getBaseDailyRate() {
        return baseDailyRate;
    }

    public void setBaseDailyRate(double baseDailyRate) {
        this.baseDailyRate = baseDailyRate;
    }
}
