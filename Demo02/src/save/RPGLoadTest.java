package save;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class RPGLoadTest {
    public static void main(String[] args) {
        // 准备好空变量，等着接收文件里的数据
        String loadedName = "";
        int loadedHp = 0;
        int loadedAttack = 0;
        HashMap<String, Integer> loadedInventory = new HashMap<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("save.txt"));
            String firstLine=br.readLine();
            if(firstLine!=null){
                String[] split = firstLine.split(",");
                loadedName = split[0];
                loadedHp=Integer.parseInt(split[1]);
                loadedAttack=Integer.parseInt(split[2]);
            }
            String line;
            while((line=br.readLine())!=null){
                String[] split = line.split(",");
                String itemName=split[0];
                int count=Integer.parseInt(split[1]);
                loadedInventory.put(itemName,count);
            }
            br.close();
            System.out.println("---- 读档结果 ----");
            System.out.println("主角：" + loadedName + "，血量：" + loadedHp + "，攻击：" + loadedAttack);
            System.out.println("背包内容：" + loadedInventory);
        }catch (Exception e){
            System.out.println("Error!");
        }
    }
}
