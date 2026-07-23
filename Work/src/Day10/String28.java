package Day10;

import java.util.Scanner;

public class String28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = input.next();
        firstAppear(s);
    }
    public static void firstAppear(String s){

        for(int i=0;i<s.length();i++){
            boolean flag = true;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                int count=0;
                for(int j=0;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                       count++;
                    }
                }
                if(count==1){
                    System.out.println(s.charAt(i));
                    break;
                }
            }
        }
        System.out.println("not found");
    }
}
