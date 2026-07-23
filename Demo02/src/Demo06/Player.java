package Demo06;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }
    public void attack(Weapon weapon){
        System.out.println(name+" is attacking with "+weapon.getName()+". "+weapon.getDamage()+" points caused.");
    }
}
