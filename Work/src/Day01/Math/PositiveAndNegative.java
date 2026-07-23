package Day01.Math;

import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("enter a number,q for break:");
            String input=sc.next();
            if(input.equals("q"))
                break;
            int n=Integer.parseInt(input);
            if(n>0)
            {
                System.out.println(n+" is positive");
            } else if (n==0) {
                System.out.println(n+" is zero");
            }
            else {
                System.out.println(n+" is negative");
            }
        }
    }
}
