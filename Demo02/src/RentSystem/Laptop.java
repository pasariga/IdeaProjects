package RentSystem;

public class Laptop extends Device{
    private String cpu;
    public Laptop(String cpu,String id,String brand,double baseDailyRate){
        super(id,brand,baseDailyRate);
    }
    @Override
    public double calculateRent(int days){
        return getBaseDailyRate()*days;
    }
}
