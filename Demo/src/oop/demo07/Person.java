package oop.demo07;

public class Person {
    //2
    {
        System.out.println("匿名代码块");//代码块（匿名代码块）
    }
    //1
    static {
        System.out.println("静态代码块");
        //静态代码块
    }
    //3
    public Person(){
        System.out.println("构造方法");
    }

  public static void main(String[] args) {
        Person person = new Person();
System.out.println("=============");
Person person2=new Person();
  }
}
