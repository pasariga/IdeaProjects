package Demo08;

public abstract class GameEntity {
    private String name;
    private int hp;
    private int ap;
    public GameEntity(String name, int hp, int ap){
        this.name = name;
        this.hp = hp;
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAp() {
        return ap;
    }

    public boolean isAlive(){
        if(this.hp<=0){
            return false;
        }
        return true;
    }
    public void takeDamage(int dmg){
        this.hp -= dmg;
    }
}
