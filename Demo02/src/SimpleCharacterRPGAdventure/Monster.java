package SimpleCharacterRPGAdventure;

public class Monster {
    private String name;
    private int hp;
    public Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    void takeDamage(int damage) {
        this.hp -= damage;
        if(hp<=0) {
            System.out.println("Monster is dead");
            return;
        }
    }
}
