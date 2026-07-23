package Demo06;

public class Hero {
    private String name;
    private int attackPower;
    public Hero(String name,int attackPower){
        this.name=name;
        this.attackPower=attackPower;
    }
    public void strike(Monster m){
        m.setHp(m.getHp()-attackPower);
        System.out.println(name+" attacked "+m.getName()+". "+"Monster remains "+m.getHp());
        if(m.getHp()<=0){
            System.out.println(m.getName()+" is dead.");
        }
    }
}
