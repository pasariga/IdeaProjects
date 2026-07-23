package Work06;

import java.util.Scanner;

public class Calculator {
    public static   void main(String args[])
    {
        while(true)
        {
            //扫描第一个数字
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number:");
            double num1 = input.nextDouble();
            //扫描运算符
            System.out.println("请输入运算符，输入q退出");
            String op=input.next();
            //扫描第二个数字
            System.out.println("Enter second number:");
            double num2 = input.nextDouble();
            //如果扫描到‘q’，则退出
            if(op.equals("q")){
                break;
            }
            switch(op){
                case "+":
                    System.out.println(num1+num2);
                    break;
                    case "-":
                        System.out.println(num1-num2);
                        break;
                        case "*":
                            System.out.println(num1*num2);
                            break;
                            case "/":
                                System.out.println(num1/num2);
                                break;
            }
        }
    }
    public static double add(double num1,double num2){
        return num1+num2;
    }
    public static double sub(double num1,double num2){return num1-num2;}
    public static double mul(double num1,double num2){return num1*num2;}
    public static double div(double num1,double num2){return num1/num2;}
}
