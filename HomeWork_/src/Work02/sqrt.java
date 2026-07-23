package Work02;

import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        //扫描输入内容
        Scanner sc=new Scanner(System.in);
        //输入a
        System.out.println("enter a:");
        //扫描a
        double a=sc.nextDouble();
        //b、c 同理
        System.out.println("enter b:");
        double b=sc.nextDouble();
        System.out.println("enter c:");
        double c=sc.nextDouble();
        //result为double类型，用Math.sqrt写出根号
        double result=(Math.sqrt(b*b-4*a*c)-b)/2*a;
        System.out.println("result:"+result);
    }
}
