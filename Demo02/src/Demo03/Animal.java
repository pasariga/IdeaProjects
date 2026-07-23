package Demo03;

public class Animal {
    private String name;
    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void eat(){
        System.out.println(getName()+" is eating");
    }
    public void move(){
        System.out.println(getName()+" is moving");
    }
}
