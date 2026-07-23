package RentSystem;

public class Main {
    public static void main(String[] args) {
        RentableManager manager =new RentableManager();
        Laptop l1=new Laptop("i7","wagfyg","ASUS",30);
        Projector p1=new Projector(false,"cjnd","HUAWEI",40);
        Projector p2=new Projector(true,"dschsdbh","SAMSANG",40);
        manager.addDevice(l1);
        manager.addDevice(p1);
        manager.addDevice(p2);
        System.out.println(manager.calculateTotalRent(5));
    }
}
