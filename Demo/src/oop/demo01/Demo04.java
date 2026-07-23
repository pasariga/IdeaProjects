package oop.demo01;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Demo04 {
    public static void main(String[] args) {
        int a=1;
        System.out.println(a);
        Demo04.change(a);
        System.out.println(a);
        System.out.println("=========");
    }

    public static void change(int a){
        a=10;
        System.out.println(a);
    }
}
