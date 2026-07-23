package Work04;

import java.util.Scanner;

public class GCD {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a=input.nextInt();
        System.out.print("Enter b: ");
        int b=input.nextInt();
        int temp=1;
        for(int j=2;j<=Math.min(a,b);j++){
            if(a%j==0&&b%j==0){
                temp=j;
            }
        }
        System.out.println(a+"和"+b+"的公约数是："+temp);
    }
}
