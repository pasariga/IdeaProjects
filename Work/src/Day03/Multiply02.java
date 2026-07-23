package Day03;

import java.util.Scanner;

public class Multiply02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum=1;
        for(int j=1;j<=num;j++){
            sum*=j;
        }
        System.out.print(sum);
    }
}
