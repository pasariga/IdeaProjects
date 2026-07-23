package oop.demo01;

import java.io.IOException;

//Demo01类
public class Demo01 {
    //main方法
    public static void main(String[] args) {

        Demo01 demo=new Demo01();
        System.out.println(demo.sayHello());
        System.out.println(demo.max(3,4));
    }
    public String sayHello(){
        return "hello,world!";
    }
    public void print(){
        return;
    }
    //三元运算符
    public int max(int a,int b){
        return a>b?a:b;
    }
    public void readFile(String file) throws IOException {


    }
}
