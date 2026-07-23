package Demo04;

public class Cat extends Animal{
    public Cat(String name,int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(getName()+" is eating elegantly.");
    }
}
