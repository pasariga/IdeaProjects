package SimpleCharacterRPGAdventure;

public class Warrior extends  Hero {
    public Warrior(String name,int hp,int baseAttack) {
        super(name,hp,baseAttack);
    }
    @Override
    public void attack(Monster m){
        int damage;
        if(Math.random()<0.3){
            damage=this.baseAttack*2;
        }
        else{
            damage=this.baseAttack;
        }
        System.out.println("The warrior is attacking with a " + this.getName()+",causing " +damage);
        m.takeDamage(damage);
    }
}
