package Demo03;


public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    public void meow(){
        System.out.println(" meowing");
    }
    //cat会在自己类中找到是否有自 己的move，若没有，则会去找extends的animal
    @Override
    public void move(){
        //若想在重写中调用父类的方法，则用super
        super.move();
        System.out.println(getName()+" is moving elegantly.");
    }
}
