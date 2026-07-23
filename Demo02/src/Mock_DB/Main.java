package Mock_DB;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        MockDatabase md=new MockDatabase();
        BountyTarget bt1=new BountyTarget(112,"陈启稳",44,false);
        BountyTarget bt2=new BountyTarget(112,"甘志豪",33,false);
        BountyTarget bt3=new BountyTarget(112,"王童杰",22,false);
         md.insert(bt1);
         md.insert(bt2);
         md.insert(bt3);
         md.selectAll();
        Connection conn=DBUtil.getConnection();
        if(conn!=null){
            System.out.println("DATABASE linked!");
        }
        else{
            System.out.println("DATABASE NOT linked!");
        }
    }
}
