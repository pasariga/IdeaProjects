package Day02;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.print(i+"\t");
            }
        }
    }
}
