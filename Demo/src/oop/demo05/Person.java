package oop.demo05;
//Person 人
//在java中，所以的类，都默认直接或间接继承object
public class Person /* extends Object*/{
    public Person(String name) {
        this.name = name;
        System.out.println("Person无参执行了"+name);
    }

    protected String name="ganzhihao";
    //私有的东西无法被继承
    public void print(){
        System.out.println("Person");
    }
}
