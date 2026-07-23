package Demo07;

public class Duck extends Animal implements Swimmable{
    public Duck(String name) {
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(getName()+" is eating aquatic plants.");
    }
    @Override
    public void swim(){
        System.out.println(getName()+" is paddling and flapping wings on the water surface.");
    }
}
