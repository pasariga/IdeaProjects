/*
package Demo08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

// 1. 核心规约（接口）：定义一个 Attacker 接口
interface Attacker {
    void attack(GameEntity target);
}

// 2. 基础结构（抽象类 & 封装）：定义 GameEntity
abstract class GameEntity {
    private String name;
    private int hp;
    private int ap; // 攻击力

    public GameEntity(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    // 封装的保安逻辑：检查生命状态
    public boolean isAlive() {
        return hp > 0;
    }

    // 封装的保安逻辑：受到伤害
    public void takeDamage(int dmg) {
        if (dmg < 0) dmg = 0; // 防止恶意负伤害反而在加血
        this.hp -= dmg;
        if (this.hp < 0) this.hp = 0; // 防止血量变成负数
        System.out.println(">>> [" + this.name + "] was damaged, current HP is: " + this.hp);
    }

    public String getName() { return name; }
    public int getAp() { return ap; }
}

// 3. 具体角色（继承 & 多态）：英雄 V
class Hero extends GameEntity implements Attacker {
    // 集合：V 的四次元武器库
    private ArrayList<String> weapons;
    private Random random = new Random();

    public Hero(String name, int hp, int ap) {
        super(name, hp, ap); // 调用老爸的构造方法
        this.weapons = new ArrayList<>();
    }

    public void addWeapon(String weaponName) {
        this.weapons.add(weaponName);
    }

    @Override
    public void attack(GameEntity target) {
        if (weapons.isEmpty()) {
            System.out.println("[" + getName() + "] has no weapons, punched for minimal damage!");
            target.takeDamage(1);
            return;
        }

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

// 3. 具体角色（继承 & 多态）：怪物
class Monster extends GameEntity implements Attacker {
    public Monster(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    @Override
    public void attack(GameEntity target) {
        System.out.println(">>> [" + getName() + "] counter-attacks [" + target.getName() + "], dealing " + getAp() + " damage.");
        target.takeDamage(getAp());
    }
}

// 4. 战斗核心（主循环）
public class CyberBattleMiniGame {
    public static void main(String[] args) {
        System.out.println("--- WELCOME TO CYBERPUNK BATTLE SIMULATOR (v0.1) ---");

        // Step A: 初始化英雄 V
        Hero v = new Hero("V", 100, 20);
        v.addWeapon("螳螂刀 (Mantis Blades)");
        v.addWeapon("强尼的手枪 (Malorian 3516)");
        v.addWeapon("武士刀 (Katana)");

        // Step B: 初始化怪物数据（HashMap 简化数据存储）
        // 名字 -> [HP, AP]
        HashMap<String, Integer[]> monsterTemplates = new HashMap<>();
        monsterTemplates.put("Maelstrom Goon", new Integer[]{60, 15});
        monsterTemplates.put("Scavenger Leader", new Integer[]{80, 22});

        // 多态体验：从 Map 中利用模板动态 new 一个特定的怪物
        String targetName = "Maelstrom Goon";
        Integer[] stats = monsterTemplates.get(targetName);
        Monster enemy = new Monster(targetName, stats[0], stats[1]);

        System.out.println("[BATTLE START] " + v.getName() + " vs " + enemy.getName() + "\n");

        // Step C: 战斗主循环
        int turnCount = 1;
        while (v.isAlive() && enemy.isAlive()) {
            System.out.println("=== TURN " + turnCount + " ===");

            // 多态调用：虽然类型是 Attacker 接口，但调用的是具体的 attack 逻辑
            Attacker vAsAttacker = v;
            vAsAttacker.attack(enemy);

            if (!enemy.isAlive()) {
                System.out.println("\n[GAME OVER] " + enemy.getName() + " was defeated!");
                break;
            }

            // 怪物回合
            enemy.attack(v);

            if (!v.isAlive()) {
                System.out.println("\n[GAME OVER] " + v.getName() + " was flatlined!");
                break;
            }

            turnCount++;
            System.out.println(); // 换行增加可读性
        }

        System.out.println("\n--- SIMULATION END ---");
    }
}
*/
