package Demo08;

import java.util.ArrayList;

public class TestWeaponList {
    public static void main(String[] args) {
        ArrayList<Weapons> inventory = new ArrayList<>();
//        Weapons w1=new Weapons("螳螂刀",500);
//        Weapons w2=new Weapons("守望",400);
//        Weapons w3=new Weapons("觉",300);
        inventory.add(new Weapons("螳螂刀",50));
        inventory.add(new Weapons("守望",200));
        inventory.add(new Weapons("觉",300));
        for(Weapons w:inventory){
            if(w.getDamage()>=100){
                System.out.println(w.getName());
            }
        }
    }
}
