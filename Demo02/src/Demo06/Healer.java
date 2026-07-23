package Demo06;

public class Healer {
    private String name;
    private int healAmount;
    public Healer(String name, int healAmount) {
        this.name = name;
        this.healAmount = healAmount;
    }
    public void groupHeal(Teammate[] team){
        for(int i=0;i<team.length;i++){
            team[i].setHp(team[i].getHp()+healAmount);
            System.out.println(name+" healed "+team[i].getName()+" . Current blood volume is "+team[i].getHp()+" .");
        }
    }
}
