package Day02;

import java.util.Scanner;

public class Multiply02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = input.nextInt();
        if(num % 3 == 0 && num % 5 == 0){
            System.out.print(num+"既是3的倍数又是5的倍数");
        }
        else{
            System.out.print(num+"不是同时是3和5的倍数");
        }
    }
}
