package oop.demo08;
//abstract 抽象类
public abstract class Action {
    //约束，有帮我实现
    //abstract,抽象方法，只有方法名字，没有方法的实现！
    public abstract void doSomething();
    //1.不能new这个抽象类，只能靠子类去实现他：约束
    //2.抽象类中可以写普通方法
    //3.抽象方法必须在抽象类中
    //抽象的抽象：约束
}
