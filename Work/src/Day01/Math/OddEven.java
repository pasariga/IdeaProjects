package Day01.Math;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number,q for break: ");
            String input=sc.next();
            if(input.equals("q")){
                break;
            }
            int n=Integer.parseInt(input);
            if (n % 2 == 0) {
                System.out.println("Even");
            } else if (n == 0) {
                System.out.println("zero");

            } else {
                System.out.println("Odd");
            }
        }
    }

}
