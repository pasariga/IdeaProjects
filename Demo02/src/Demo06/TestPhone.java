package Demo06;

public class TestPhone {
    public static void main(String[] args) {
        Phone p1=new Phone("iPhone 17 Pro Max",9999);
        System.out.println(p1.getBrand()+" "+p1.getPrice());
        p1.setPrice(-9999);
        System.out.println(p1.getBrand()+" "+p1.getPrice());
        p1.playMusic();
    }
}
