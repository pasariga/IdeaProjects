package Demo07;

public class Dog extends  Animal implements Swimmable {
    //如果父类有抽象方法的抽象类，那子类就必须全部实现
    @Override
    public void swim() {
        System.out.println(getName()+" is swimming happily.");
    }

    public Dog(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is gnawing on bones wildly.");
    }
}
