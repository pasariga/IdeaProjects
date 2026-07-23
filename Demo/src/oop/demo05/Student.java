package oop.demo05;
//学生  is  人     :派生类，子类
//子类继承了父类
public class Student extends Person {

    public Student() {
        //隐藏代码：调用了父亲的无参构造
        super("孙浩");//调用父亲的构造器，必须要在子类构造器的那一行

         System.out.println("Student无参执行了"+super.name);
    }


    private String name="sunhao";
    public void print(){
        System.out.println("Student");
    }
    public void test1(){
       print();//Student
       this.print();//Student
       super.print();//Person
    }
    public void test2(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }


}
