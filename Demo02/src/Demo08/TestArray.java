package Demo08;

import java.util.ArrayList;

public class TestArray {
    public static void main(String[] args) {
        ArrayList<String> Weapons = new ArrayList<>();
        Weapons.add(0,"螳螂刀");
        Weapons.add(1,"守望");
        Weapons.add(2,"觉");
        System.out.println(Weapons.size());
        Weapons.remove(1);
        for(String s:Weapons){
            System.out.println(s);
        }
    }
}
