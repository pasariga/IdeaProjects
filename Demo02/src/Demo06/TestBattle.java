package Demo06;

public class TestBattle {
    public static void main(String[] args) {
        Hero h1=new Hero("Hero",40);
        Monster m1=new Monster("Goblin",100);
        h1.strike(m1);
        h1.strike(m1);
        h1.strike(m1);
    }
}
