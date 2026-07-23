package oop.demo01;

public class Demo02 {
    //引用传递：对象，本质还是值传递
    public static void main(String[] args) {
        //对象类型   对象名=对象值
        //实例化这个类 new
        Student student=new Student();
        student.say();
        Demo02 demo02=new Demo02();
        demo02.a();
    }

    public void a(){
        b(10);
    }
    public void b(int a){
        System.out.println(a);
    }
    }
