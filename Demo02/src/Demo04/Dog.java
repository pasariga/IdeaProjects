package Demo04;

public class Dog extends Animal implements Swimmable{
    public Dog(String name,int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println(getName()+" is eating wildly.");
    }

    @Override
    public void swim() {
         System.out.println(getName()+" is swimming happily.");
    }
}
