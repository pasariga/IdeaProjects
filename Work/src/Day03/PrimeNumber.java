package Day03;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter a number:");
            int n = sc.nextInt();
            boolean flag = true;
            if (n < 2) {
                flag = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }

                }
            }
            if (flag) {
                System.out.println(n + "是质数");
            } else {
                System.out.println(n + "不是质数");
            }
        }
    }
}
