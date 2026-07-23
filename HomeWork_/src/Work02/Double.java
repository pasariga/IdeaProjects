package Work02;

import java.util.Scanner;

public class Double {
    public  static void main(String[] args) {
        //扫描输入的内容
        Scanner sc=new Scanner(System.in);
        //进入循环
        while (true){
            System.out.println("please enter,enter q to exit:");
            //把输入内容转换为字符
            String str=sc.next();
            //输入q退出
            if(str.equals("q")){
                break;
            }
            //把输入内容转换为double类型
            double d= java.lang.Double.parseDouble(str);

            //把double变为int类型
            int Int=(int) d;
            System.out.println("整数是："+Int);
            System.out.println("小数是："+(d-Int));
        }
    }
}
