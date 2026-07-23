package Demo08;

import java.util.ArrayList;
import java.util.Random;

public class Hero extends GameEntity implements Attacker{
    public void addWeapon(String weaponName) {
        this.weapons.add(weaponName);
    }
   private ArrayList<String> weapons;
   private Random random = new Random();
   public Hero(String name, int hp, int ap){
       super(name,hp,ap);
       this.weapons = new ArrayList<>();
   }
    @Override
    public void attack(GameEntity target) {
        // ArrayList 遍历操作：随机选择一个索引
        int index = random.nextInt(weapons.size());
        String currentWeapon = weapons.get(index);
        // 计算伤害浮动 (1.0x 到 1.5x)
        double modifier = 1.0 + (1.5 - 1.0) * random.nextDouble();
        int dmg = (int) (getAp() * modifier);

        System.out.println(">>> [" + getName() + "] uses [" + currentWeapon + "] to attack [" + target.getName() + "], dealing " + dmg + " damage.");
        target.takeDamage(dmg);
    }

}
