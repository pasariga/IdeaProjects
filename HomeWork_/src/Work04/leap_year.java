package Work04;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year");
        int year=sc.nextInt();
        boolean flag=false;
        if(year%400==0||year%4==0&&year%100!=0){
            flag=true;
        }
        if(flag){
            System.out.println(year+" is leap year");
        }
        else{
            System.out.println(year+" is not Leap year");
        }
    }
}
