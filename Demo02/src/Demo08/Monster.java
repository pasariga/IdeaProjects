package Demo08;

public class Monster extends GameEntity implements Attacker{
    public Monster(String name, int hp,int ap) {
        super(name,hp,ap);
    }
    @Override
    public void attack(GameEntity target) {
        System.out.println(">>> [" + getName() + "] counter-attacks [" + target.getName() + "], dealing " + getAp() + " damage.");
        target.takeDamage(getAp());
    }
}
