package Work02;

import java.util.Scanner;

public class sqrt01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double result=(Math.sqrt(b*b-4*a*c)-b)/2*a;
    }
}
