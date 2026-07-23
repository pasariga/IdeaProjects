package Demo08;

import java.util.ArrayList;
import java.util.HashMap;

public class CyberBattleMiniGame  {
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
