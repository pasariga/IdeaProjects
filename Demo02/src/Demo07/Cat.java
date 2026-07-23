package Demo07;

public class Cat extends Animal{
    //把自己的名字存入父类animal
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(getName()+" is eating fish elegantly.");
    }
    public void meow(){
        System.out.println(getName()+" is meowing.");
    }
}
