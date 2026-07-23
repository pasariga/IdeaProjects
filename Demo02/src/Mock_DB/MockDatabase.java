package Mock_DB;

import java.util.ArrayList;

public class MockDatabase {
    ArrayList<BountyTarget>targetTable=new ArrayList<>();
    void insert(BountyTarget target){
        targetTable.add(target);
        System.out.println("insert "+target+" successfully");
    }
    void selectAll(){
         System.out.println("select all");
         for(BountyTarget target:targetTable){
             System.out.println(target);
         }
    }
}
