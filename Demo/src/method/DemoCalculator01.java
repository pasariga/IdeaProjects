package method;

import java.util.Scanner;

public class DemoCalculator01 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("请输入第一个数字：");
            double num1=sc.nextDouble();
            System.out.print("请输入运算符：");
            String op=sc.next();
            System.out.print("请输入第二个数字：");
            double num2=sc.nextDouble();
            switch(op){
                case"+":
                    System.out.println("结果："+add(num1,num2));
                    break;
                case"-":
                    System.out.println("结果："+minus(num1,num2));
                    break;
                case"*":
                    System.out.println("结果："+multiply(num1,num2));
                    break;
                case"/":
                    System.out.println("结果："+divide(num1,num2));
                    break;
            }
        }
    }
    public static double add(double num1,double num2)
    {
        return num1+num2;

    }
    public static double minus(double num1,double num2){

        return num1-num2;
    }
    public static double multiply(double num1,double num2){

        return num1*num2;
    }
    public static double divide(double num1,double num2){

        return num1/num2;
    }
}
