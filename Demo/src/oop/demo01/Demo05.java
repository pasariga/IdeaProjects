package oop.demo01;

public class Demo05 {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.name);//null
        Demo05.change(p);
        System.out.println(p.name);
    }
    public static void change(Person p){
        p.name="呵呵";
    }
}
//定义了一个person类，有一个属性：name
class Person{
    String name;
}
