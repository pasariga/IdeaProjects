package Day01.Math;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("较大的数是："+a);
        }
        else if(b>a){
            System.out.println("较大的数是："+b);
        }
        else {
            System.out.println("两数相等");

        }
    }
}
