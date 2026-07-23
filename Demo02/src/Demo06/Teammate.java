package Demo06;

public class Teammate {
    private String name;
    private int hp;
    public Teammate(String name,int hp){
        this.name=name;
        this.hp=hp;
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
        if (hp > 100) {
            this.hp = 100;
        } else {
            this.hp = hp;
        }
    }

}
