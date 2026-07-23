package save;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.HashMap;

public class RPGSaveTest {
    public static void main(String[] args) {
        String name="Arther";
        int hp = 100;
        int baseAttack = 20;
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("红药水", 5);
        inventory.put("铁剑", 1);
        try{
            BufferedWriter bw=new BufferedWriter(new FileWriter("save.txt"));
            bw.write(name+","+hp+","+baseAttack);
            bw.newLine();
            for(String itemName:inventory.keySet()){
                int count=inventory.get(itemName);
                bw.write(itemName+","+count);
                bw.newLine();
            }
            bw.close();
            System.out.println("Data saved successfully");
        }catch(Exception e){
            System.out.println("Error!");
        }

    }
}
