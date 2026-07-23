package Work03;

import java.util.Scanner;

public class EvenScore {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入数学成绩：");
        double a=sc.nextDouble();
        System.out.print("请输入语文成绩：");
        double b=sc.nextDouble();
        System.out.print("请输入英语成绩：");
        double c=sc.nextDouble();
        double even = (a+b+c)/3;
        System.out.printf("三门科目的平均成绩是:%.1f",even);
    }
}
