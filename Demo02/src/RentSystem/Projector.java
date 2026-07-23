package RentSystem;

public class Projector extends Device{
    private boolean is4K;
    public Projector(boolean is4K,String id,String brand,double baseDailyRate){
        super(id,brand,baseDailyRate);
    }
    @Override
    public double calculateRent(int days) {
        if (is4K) {
            return (getBaseDailyRate() + 20) * days;
        }
        return getBaseDailyRate()  * days;
    }

}
