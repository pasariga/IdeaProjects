package SimpleCharacterRPGAdventure;

public class Mage extends Hero{
    public Mage(String name,int hp,int baseAttack) {
        super(name,hp,baseAttack);
    }
    @Override
    public void attack(Monster m) {
        int damage=this.baseAttack+20;
        m.takeDamage(damage);
        System.out.println(this.name+" attacks with a " + this.getName()+",causing " +damage);
    }
}
