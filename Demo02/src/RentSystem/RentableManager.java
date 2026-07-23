package RentSystem;

import java.util.ArrayList;

public class RentableManager {
    ArrayList<Device>deviceList=new ArrayList<Device>();
    void addDevice(Device device){
            deviceList.add(device);
    }
    double calculateTotalRent(int days){
        double total=0;
        for(Device device:deviceList){
            total+=device.calculateRent(days);
        }
        return total;
    }
}
