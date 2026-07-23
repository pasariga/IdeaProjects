package Demo06;

public class TestGame {
    public static void main(String[] args) {
        Weapon w1=new Weapon("Gundam",5999);
        Player p1=new Player("Kira");
        p1.attack(w1);
    }
}
