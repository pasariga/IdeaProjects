package Day02;

import java.util.Scanner;

public class EvenAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n=input.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            if(i%2==0){
                sum+=i;
            }
            //将i++写在if循环内，当i=1时，进入死循环
            i++;
        }
        System.out.println("从1到"+n+"的偶数和为："+sum);
    }
}
