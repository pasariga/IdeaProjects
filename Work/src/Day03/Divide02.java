package Day03;

import java.util.Scanner;

public class Divide02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count=0;
        for (int i = 1; i <=num; i++) {
            if(num%i==0){
                count++;
            }
        }
        System.out.println(num+"约数的个数为："+count);
        input.close();
    }
}
