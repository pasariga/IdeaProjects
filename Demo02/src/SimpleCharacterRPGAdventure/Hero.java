package SimpleCharacterRPGAdventure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public abstract class Hero {
    protected String name;
    protected int hp;
    protected int baseAttack;

    public Hero(String name, int hp, int baseAttack) {
        this.name = name;
        this.hp = hp;
        this.baseAttack = baseAttack;
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

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }
    abstract void attack(Monster m);
    HashMap<String,Integer> inventory=new HashMap<>();
    void lootItem(String itemName){
            if(inventory.containsKey(itemName)){
                inventory.put(itemName,inventory.get(itemName)+1);
            }
            else{
                inventory.put(itemName,1);
            }
            System.out.println("You gained "+itemName+" . ");
        }
    void showStatus(){
        System.out.println("Hero name:"+this.name+" . Occupation:"+this.getClass().getSimpleName()+" . HP:"+this.getHp()+" . Inventory" +
                inventory);
    }
    void saveToFile(){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("save.txt"));
            bw.write(this.name+","+this.getHp()+","+this.baseAttack);
            bw.newLine();
            for(Map.Entry<String,Integer> entry:inventory.entrySet()){
                bw.write(entry.getKey()+","+entry.getValue());
                bw.newLine();
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void loadFromFile(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("save.txt"));
            String line=br.readLine();
            if(line!=null) {
                String[] split = line.split(",");
                this.name = split[0];
                this.hp = Integer.parseInt(split[1]);
                this.baseAttack = Integer.parseInt(split[2]);
            }
            while ((line=br.readLine())!=null){
                //创建String类型数组
                    String[] itemData = line.split(",");
                    //一个存储单元的第一个位置存itemName
                    String itemName=itemData[0];
                    //一个存储单元的第二个位置存count
                    int count=Integer.parseInt(itemData[1]);
                    //把inventory 塞进数组中
                    inventory.put(itemName,count);
                }
                br.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
