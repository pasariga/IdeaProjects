package SimpleCharacterRPGAdventure;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Warrior w;
        File file = new File("save.txt");
        if(file.exists()){
            System.out.println("File found.");
            w=new Warrior("",0,0);
            w.loadFromFile();
        }
        else{
            System.out.println("Welcome to Simple Character RPG Adventure");
            System.out.println("Please enter your name:");
            String name = input.nextLine();
            w=new Warrior(name,100,20);
        }
        while (true){
            System.out.println("1 for explore,2 for status,3 for rest,4 for saving and exit");
            int choice = input.nextInt();
            switch (choice){
                    case 1:
                    System.out.println("Exploring the monster. Monster explored . Now attacking.");
                    Monster m=new Monster("Goblin",200);
                    while(m.getHp()>0){
                        w.attack(m);
                    }
                    w.lootItem("恢复药水");
                    w.lootItem("恢复药水");
                    w.lootItem("铁剑");
                    break;
                    case 2:
                    w.showStatus();
                        break;
                    case 3:
                    System.out.println("Hero is resting.Hero's HP is 100");
                    w.setHp(100);
                        break;
                    case 4:
                        System.out.println("See you again.");
                        w.saveToFile();
                        return;
                        default:
                            System.out.println("Invalid choice. Try again");break;
            }
        }
    }
}
