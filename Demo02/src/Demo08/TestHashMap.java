package Demo08;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> ammoBox=new HashMap<>();
        ammoBox.put("手枪弹药",50);
        ammoBox.put("步枪弹药",120);
        ammoBox.put("狙击枪弹药",15);
        //hashmap是无序的
        for(String ammoName:ammoBox.keySet()){
            System.out.println("Ammo Type:"+ammoName+",surplus:"+ammoBox.get(ammoName));
        }
    }
}
