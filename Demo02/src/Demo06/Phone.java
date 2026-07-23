package Demo06;

public class Phone {
    private String brand;
    private double price;
    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
        } else {
            this.price = price;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void playMusic() {
        System.out.println(getBrand()+" is Playing music");
    }
}
